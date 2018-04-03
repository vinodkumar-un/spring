package com.dt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dt.bo.PatientBo;

public class PatientDaoImpl implements PatientDao {
	private final String SQL_SAVE_PATIENT = "insert into patient(patient_no, patient_nm, age, gender) values(?,?,?,?)";
	private JdbcTemplate jdbcTemplate;

	public PatientDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void savePatient(PatientBo patientBo) {
		jdbcTemplate.update(
				SQL_SAVE_PATIENT,
				new Object[] { patientBo.getPatientNo(),
						patientBo.getPatientName(), patientBo.getAge(),
						patientBo.getGender() });
	}

}
