package com.ca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.StatementCallback;

import com.ca.bo.ProjectBo;

public class ProjectDao {
	private final String SQL_GET_PROJECTS_BY_DURATION = "SELECT PROJECT_NO, TITLE, DESCR, DURATION, STATUS FROM PROJECT WHERE DURATION > ?";
	private final String SQL_GET_ALL_PROJECTS = "SELECT PROJECT_NO, TITLE, DESCR, DURATION, STATUS FROM PROJECT";

	private JdbcTemplate jdbcTemplate;

	public ProjectDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<ProjectBo> getProjectsByDuration(int duration) {
		GetProjectsByDurationStatementCreator gpdsc = null;
		GetProjectsByDurationStatementCallback gpdscb = null;

		gpdsc = new GetProjectsByDurationStatementCreator(duration);
		gpdscb = new GetProjectsByDurationStatementCallback();

		return jdbcTemplate.execute(gpdsc, gpdscb);
	}

	public List<ProjectBo> getAllProjects() {
		return jdbcTemplate.execute(new GetAllProjectsStatementCallback());
	}

	private final class GetAllProjectsStatementCallback implements
			StatementCallback<List<ProjectBo>> {
		@Override
		public List<ProjectBo> doInStatement(Statement stmt)
				throws SQLException, DataAccessException {
			ResultSet rs = null;
			ProjectBo projectBo = null;
			List<ProjectBo> projects = null;

			projects = new ArrayList<ProjectBo>();
			rs = stmt.executeQuery(SQL_GET_ALL_PROJECTS);
			while (rs.next()) {
				projectBo = new ProjectBo();
				projectBo.setProjectNo(rs.getInt("PROJECT_NO"));
				projectBo.setTitle(rs.getString("TITLE"));
				projectBo.setDuration(rs.getInt("DURATION"));
				projectBo.setDescription(rs.getString("DESCR"));
				projectBo.setStatus(rs.getString("STATUS"));
				projects.add(projectBo);
			}
			return projects;
		}
	}

	private final class GetProjectsByDurationStatementCreator implements
			PreparedStatementCreator {
		private int duration;

		public GetProjectsByDurationStatementCreator(int duration) {
			this.duration = duration;
		}

		@Override
		public PreparedStatement createPreparedStatement(Connection con)
				throws SQLException {
			PreparedStatement pstmt = null;

			pstmt = con.prepareStatement(SQL_GET_PROJECTS_BY_DURATION);
			pstmt.setInt(1, duration);
			return pstmt;
		}
	}

	private final class GetProjectsByDurationStatementCallback implements
			PreparedStatementCallback<List<ProjectBo>> {
		@Override
		public List<ProjectBo> doInPreparedStatement(PreparedStatement pstmt)
				throws SQLException, DataAccessException {
			ResultSet rs = null;
			ProjectBo projectBo = null;
			List<ProjectBo> projects = null;

			projects = new ArrayList<ProjectBo>();
			rs = pstmt.executeQuery();
			while (rs.next()) {
				projectBo = new ProjectBo();
				projectBo.setProjectNo(rs.getInt("PROJECT_NO"));
				projectBo.setTitle(rs.getString("TITLE"));
				projectBo.setDuration(rs.getInt("DURATION"));
				projectBo.setDescription(rs.getString("DESCR"));
				projectBo.setStatus(rs.getString("STATUS"));
				projects.add(projectBo);
			}
			return projects;
		}
	}

}
