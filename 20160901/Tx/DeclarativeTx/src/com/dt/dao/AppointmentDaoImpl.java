package com.dt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dt.bo.AppointmentBo;

public class AppointmentDaoImpl implements AppointmentDao {
	private final String SQL_SAVE_APPOINTMENT = "insert into appointments(appointment_no, appointment_dt, doctor_no, patient_no) values(?,?,?,?)";
	private JdbcTemplate jdbcTemplate;

	public AppointmentDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void saveAppointment(AppointmentBo appointmentBo) {
		jdbcTemplate.update(
				SQL_SAVE_APPOINTMENT,
				new Object[] { appointmentBo.getAppointmentNo(),
						appointmentBo.getAppointmentDate(),
						appointmentBo.getDoctorNo(),
						appointmentBo.getPatientNo() });
	}

}
