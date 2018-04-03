package com.npjt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.npjt.bo.ProjectBo;

public class ProjectDao {
	private final String SQL_GET_PROJECTS_BY_DURATION = "select project_no, title, descr, duration, status from project where duration > :duration";
	private final String SQL_GET_TITLE_BY_ID = "select title from project where project_no = :pNo";
	private final String SQL_INS_PROJECT = "insert into project(project_no, title, descr, duration, status) values(:projectNo, :title, :description, :duration, :status)";
	private NamedParameterJdbcTemplate npJdbcTemplate;
	private DataSource dataSource;

	public ProjectDao(DataSource dataSource) {
		this.dataSource = dataSource;
		this.npJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public List<ProjectBo> getProjectsByDuration(int duration) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("duration", duration);
		return npJdbcTemplate.query(SQL_GET_PROJECTS_BY_DURATION, paramMap,
				new ProjectRowMapper());
	}

	public String findTitleById(int projectNo) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("pNo", projectNo);
		return npJdbcTemplate.queryForObject(SQL_GET_TITLE_BY_ID, paramSource,
				String.class);
	}

	public int saveProject(ProjectBo bo) {
		return npJdbcTemplate.update(SQL_INS_PROJECT,
				new BeanPropertySqlParameterSource(bo));
	}

	public int saveProjectEasily(ProjectBo bo) {
		SimpleJdbcInsert sji = new SimpleJdbcInsert(dataSource);
		sji.setTableName("project");
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("project_no", bo.getProjectNo());
		paramSource.addValue("title", bo.getTitle());
		paramSource.addValue("descr", bo.getDescription());
		paramSource.addValue("duration", bo.getDuration());
		paramSource.addValue("status", bo.getStatus());
		return sji.execute(paramSource);
	}

	private final class ProjectRowMapper implements RowMapper<ProjectBo> {
		@Override
		public ProjectBo mapRow(ResultSet rs, int rowIndex) throws SQLException {
			ProjectBo bo = new ProjectBo();
			bo.setProjectNo(rs.getInt(1));
			bo.setTitle(rs.getString(2));
			bo.setDescription(rs.getString(3));
			bo.setDuration(rs.getInt(4));
			bo.setStatus(rs.getString(5));
			return bo;
		}
	}

}
