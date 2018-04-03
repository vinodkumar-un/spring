package com.redbus.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.redbus.bo.JourneyBo;

public class JourneyDao {
	private final String SQL_GET_JOURNEYS = "select journey_no, source, destination, journey_dt, bus_no, amount from journey";
	private final String SQL_GET_JOURNEY_BY_ID = "select journey_no, source, destination, journey_dt, bus_no, amount from journey where journey_no = ?";
	private final String SQL_UPD_JOURNEY = "update journey set source = ?, destination = ?, journey_dt = ?, amount = ? where journey_no = ?";

	private JdbcTemplate jdbcTemplate;

	public JourneyDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<JourneyBo> getJourneys() {
		return jdbcTemplate.query(SQL_GET_JOURNEYS, new JourneyRowMapper());
	}

	public JourneyBo getJourney(int journeyId) {
		return jdbcTemplate.queryForObject(SQL_GET_JOURNEY_BY_ID,
				new JourneyRowMapper(), new Object[] { journeyId });
	}

	public void updateJourney(JourneyBo bo) {
		jdbcTemplate
				.update(SQL_UPD_JOURNEY,
						new Object[] { bo.getSource(), bo.getDestination(),
								bo.getJourneyDate(), bo.getAmount(),
								bo.getJourneyId() });
	}

	private final class JourneyRowMapper implements RowMapper<JourneyBo> {
		@Override
		public JourneyBo mapRow(ResultSet rs, int row) throws SQLException {
			JourneyBo bo = new JourneyBo();
			bo.setJourneyId(rs.getInt("journey_no"));
			bo.setSource(rs.getString("source"));
			bo.setDestination(rs.getString("destination"));
			bo.setJourneyDate(rs.getDate("journey_dt"));
			bo.setBusNo(rs.getInt("bus_no"));
			bo.setAmount(rs.getFloat("amount"));
			return bo;
		}
	}
}
