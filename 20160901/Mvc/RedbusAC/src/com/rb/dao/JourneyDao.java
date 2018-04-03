package com.rb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.rb.bo.BusBo;
import com.rb.bo.JourneyBusDetailsBo;

public class JourneyDao {
	private final String SQL_GET_RECENT_JOURNEYS = "select * from Journey j inner join Bus b on j.bus_no = b.bus_no order by j.journey_dt asc";
	private JdbcTemplate jdbcTemplate;

	public JourneyDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<JourneyBusDetailsBo> getRecentJourneys() {
		return jdbcTemplate.query(SQL_GET_RECENT_JOURNEYS,
				new RowMapper<JourneyBusDetailsBo>() {
					@Override
					public JourneyBusDetailsBo mapRow(ResultSet rs, int row)
							throws SQLException {
						JourneyBusDetailsBo bo = null;
						BusBo bus = null;

						bo = new JourneyBusDetailsBo();
						bo.setJourneyNo(rs.getInt("JOURNEY_NO"));
						bo.setSource(rs.getString("SOURCE"));
						bo.setDestination(rs.getString("DESTINATION"));
						bo.setJourneyDate(rs.getDate("JOURNEY_DT"));
						bo.setAmount(rs.getFloat("AMOUNT"));

						bus = new BusBo();
						bus.setBusNo(rs.getInt("BUS_NO"));
						bus.setServiceNo(rs.getString("SERVICE_NO"));
						bus.setBusType(rs.getString("TYPE"));
						bus.setCapacity(rs.getInt("CAPACITY"));

						bo.setBus(bus);

						return bo;
					}
				});
	}
}
