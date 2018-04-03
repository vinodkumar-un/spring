package com.mssc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import com.mssc.bo.ProjectBo;

public class ProjectDao {
	private final String SQL_GET_PROJECTS_BY_TITLE = "select project_no, title, descr, duration, status from project where title like ?";
	private final String SQL_UPD_DURATION_BY_NO = "update project set duration = ? where project_no = ?";
	private DataSource dataSource;
	private GetProjectsByTitle getProjectsByTitle;
	private UpdateProjectDurationByNo updateProjectDurationByNo;

	public ProjectDao(DataSource dataSource) {
		this.dataSource = dataSource;
		this.getProjectsByTitle = new GetProjectsByTitle(dataSource,
				SQL_GET_PROJECTS_BY_TITLE);
		this.updateProjectDurationByNo = new UpdateProjectDurationByNo(
				dataSource, SQL_UPD_DURATION_BY_NO);
	}

	public List<ProjectBo> getProjectsByTitle(String title) {
		return getProjectsByTitle.execute(new Object[] { "%" + title + "%" });
	}

	public int updateProjectDuration(int projectNo, int duration) {
		return updateProjectDurationByNo.update(new Object[] { duration,
				projectNo });
	}

	private final class GetProjectsByTitle extends MappingSqlQuery<ProjectBo> {

		public GetProjectsByTitle(DataSource ds, String sql) {
			super(ds, sql);
			declareParameter(new SqlParameter(java.sql.Types.VARCHAR));
			compile();
		}

		@Override
		protected ProjectBo mapRow(ResultSet rs, int rowIndex)
				throws SQLException {
			ProjectBo bo = new ProjectBo();
			bo.setProjectNo(rs.getInt(1));
			bo.setTitle(rs.getString(2));
			bo.setDescription(rs.getString(3));
			bo.setDuration(rs.getInt(4));
			bo.setStatus(rs.getString(5));
			return bo;
		}
	}

	private final class UpdateProjectDurationByNo extends SqlUpdate {
		public UpdateProjectDurationByNo(DataSource ds, String sql) {
			super(ds, sql);
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			compile();
		}

	}
}
