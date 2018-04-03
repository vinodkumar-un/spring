package com.qa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import com.qa.bo.ProjectBo;
import com.qa.bo.ProjectResourcesBo;
import com.qa.bo.ResourceBo;

public class ProjectDao {
	// sql queries
	private final String SQL_GET_NO_OF_PROJECTS = "select count(1) from project";
	private final String SQL_GET_TITLE_BY_PROJECT_NO = "select title from project where project_no = ?";
	private final String SQL_GET_PROJECT_BY_NO = "select project_no, title, descr, duration, status from project where project_no = ?";
	private final String SQL_GET_ALL_PROJECTS = "select project_no, title, descr, duration, status from project order by title";
	private final String SQL_GET_PROJECT_BY_TITLE = "select title, duration from project where title like ?";
	private final String SQL_GET_PROJECTS_AND_RESOURCES = "select p.project_no, p.title, p.descr, p.duration, p.status, r.resource_no, r.resource_nm, r.designation, r.experience, r.primary_skill from project p inner join project_resources pr on p.project_no = pr.project_no inner join resources r on r.resource_no = pr.resource_no";
	private final String SQL_INSERT_PROJECT = "insert into project(project_no, title, descr, duration, status) values(?,?,?,?,?)";
	private final String SQL_INSERT_AUTO_GEN_PROJECT = "insert into project(project_no,title, descr, duration, status) values(project_no_seq.nextval, ?,?,?,?)";

	// logic
	private JdbcTemplate jdbcTemplate;

	public ProjectDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int getNoOfProjects() {
		return jdbcTemplate.queryForInt(SQL_GET_NO_OF_PROJECTS);
	}

	public String getProjectTitle(int projectNo) {
		return jdbcTemplate.queryForObject(SQL_GET_TITLE_BY_PROJECT_NO,
				String.class, new Object[] { projectNo });
	}

	public ProjectBo getProject(final int projectNo) {
		return jdbcTemplate.queryForObject(SQL_GET_PROJECT_BY_NO,
				new Object[] { projectNo }, new ProjectRowMapper());
	}

	public List<ProjectBo> getAllProjects() {
		return jdbcTemplate.query(SQL_GET_ALL_PROJECTS, new ProjectRowMapper());
	}

	// List{
	// Map[Title=Hospital Management System duration=5]
	// Map[Title=Library Management System duration=6]
	// }

	public List<Map<String, Object>> getProjectsByTitle(String title) {
		return jdbcTemplate.queryForList(SQL_GET_PROJECT_BY_TITLE,
				new Object[] { "%" + title + "%" });
	}

	public List<ProjectResourcesBo> getProjectsAndResources() {
		return jdbcTemplate.query(SQL_GET_PROJECTS_AND_RESOURCES,
				new ProjectResourceResultSetExtractor());

	}

	public List<ProjectBo> getProjects(int pageSize, int pageNo) {
		return jdbcTemplate.query(SQL_GET_ALL_PROJECTS,
				new ProjectResultSetExtractor(pageSize, pageNo));
	}

	public int insertProject(ProjectBo project) {
		return jdbcTemplate.update(SQL_INSERT_PROJECT,
				new Object[] { project.getProjectNo(), project.getTitle(),
						project.getDescription(), project.getDuration(),
						project.getStatus() });
	}

	public Object insertProjectAndGetProjectNo(ProjectBo project) {
		GeneratedKeyHolder generatedKeys = new GeneratedKeyHolder();
		Object projectNo = 0;

		int r = jdbcTemplate.update(new InsertProjectStatementCreator(project),
				generatedKeys);
		if (r > 0) {
			Map<String, Object> keyMap = generatedKeys.getKeys();
			projectNo = keyMap.get("project_no");
		}
		return projectNo;
	}

	private final class InsertProjectStatementCreator implements
			PreparedStatementCreator {
		private ProjectBo project;

		public InsertProjectStatementCreator(ProjectBo project) {
			this.project = project;
		}

		@Override
		public PreparedStatement createPreparedStatement(Connection con)
				throws SQLException {
			PreparedStatement pstmt = null;

			pstmt = con.prepareStatement(SQL_INSERT_AUTO_GEN_PROJECT,
					new String[] { "project_no" });
			pstmt.setString(1, project.getTitle());
			pstmt.setString(2, project.getDescription());
			pstmt.setInt(3, project.getDuration());
			pstmt.setString(4, project.getStatus());
			return pstmt;
		}
	}

	private final class ProjectResultSetExtractor implements
			ResultSetExtractor<List<ProjectBo>> {
		private int pageSize;
		private int pageNo;

		public ProjectResultSetExtractor(int pageSize, int pageNo) {
			this.pageSize = pageSize;
			this.pageNo = pageNo;
		}

		@Override
		public List<ProjectBo> extractData(ResultSet rs) throws SQLException,
				DataAccessException {
			int startIndex = 0;
			int endIndex = 0;
			int rowIndex = 1;
			ProjectBo projectBo = null;
			List<ProjectBo> projects = null;

			startIndex = pageSize * (pageNo - 1) + 1;
			endIndex = pageSize * pageNo;
			projects = new ArrayList<ProjectBo>();

			while (rs.next() && rowIndex <= endIndex) {
				if (rowIndex >= startIndex) {
					projectBo = new ProjectBo();
					projectBo.setProjectNo(rs.getInt(1));
					projectBo.setTitle(rs.getString(2));
					projectBo.setDescription(rs.getString(3));
					projectBo.setDuration(rs.getInt(4));
					projectBo.setStatus(rs.getString(5));
					projects.add(projectBo);
				}
				rowIndex++;
			}
			return projects;
		}

	}

	private final class ProjectResourceResultSetExtractor implements
			ResultSetExtractor<List<ProjectResourcesBo>> {

		@Override
		public List<ProjectResourcesBo> extractData(ResultSet rs)
				throws SQLException, DataAccessException {
			int projectNo = 0;
			ResourceBo resourceBo = null;
			ProjectResourcesBo projectResourceBo = null;
			List<ProjectResourcesBo> projectResources = null;
			Map<Integer, ProjectResourcesBo> projectResourcesMap = null;

			projectResourcesMap = new HashMap<Integer, ProjectResourcesBo>();
			while (rs.next()) {
				projectNo = rs.getInt(1);
				/**
				 * Check with this projectNo does projectResource Object exists
				 */
				if (projectResourcesMap.containsKey(projectNo) == true) {
					projectResourceBo = projectResourcesMap.get(projectNo);
				} else {
					projectResourceBo = new ProjectResourcesBo();
					projectResourceBo.setProjectNo(projectNo);
					projectResourceBo.setTitle(rs.getString(2));
					projectResourceBo.setDescription(rs.getString(3));
					projectResourceBo.setDuration(rs.getInt(4));
					projectResourceBo.setStatus(rs.getString(5));
				}
				resourceBo = new ResourceBo();
				resourceBo.setResourceNo(rs.getInt(6));
				resourceBo.setResourceName(rs.getString(7));
				resourceBo.setDesignation(rs.getString(8));
				resourceBo.setExperience(rs.getInt(9));
				resourceBo.setPrimarySkill(rs.getString(10));
				if (projectResourceBo.getResources() == null) {
					projectResourceBo.setResources(new ArrayList<ResourceBo>());
				}
				projectResourceBo.getResources().add(resourceBo);
				projectResourcesMap.put(projectNo, projectResourceBo);
			}

			if (projectResourcesMap != null && projectResourcesMap.size() > 0) {
				projectResources = new ArrayList<ProjectResourcesBo>();
				for (ProjectResourcesBo bo : projectResourcesMap.values()) {
					projectResources.add(bo);
				}
			}

			return projectResources;
		}

	}

	private final class ProjectRowMapper implements RowMapper<ProjectBo> {
		@Override
		public ProjectBo mapRow(ResultSet rs, int row) throws SQLException {
			ProjectBo bo = null;

			bo = new ProjectBo();
			bo.setProjectNo(rs.getInt(1));
			bo.setTitle(rs.getString(2));
			bo.setDescription(rs.getString(3));
			bo.setDuration(rs.getInt(4));
			bo.setStatus(rs.getString(5));
			return bo;
		}
	}
}
