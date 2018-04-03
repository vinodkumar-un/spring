package com.dt.service;

import org.springframework.transaction.annotation.Transactional;

import com.dt.bo.AppointmentBo;
import com.dt.bo.PatientBo;
import com.dt.dao.AppointmentDao;
import com.dt.dao.PatientDao;
import com.dt.form.AppointmentForm;

public class ManageAppointmentServiceImpl implements ManageAppointmentService {
	private PatientDao patientDao;
	private AppointmentDao appointmentDao;

	@Override
	@Transactional(readOnly = false)
	public void newAppointment(AppointmentForm appointmentForm) {
		PatientBo patientBo = null;
		AppointmentBo appointmentBo = null;

		patientBo = new PatientBo();
		patientBo.setPatientNo(appointmentForm.getPatientNo());
		patientBo.setPatientName(appointmentForm.getPatientName());
		patientBo.setAge(appointmentForm.getAge());
		patientBo.setGender(appointmentForm.getGender());

		patientDao.savePatient(patientBo);
		appointmentBo = new AppointmentBo();
		appointmentBo.setAppointmentNo(appointmentForm.getAppointmentNo());
		appointmentBo.setAppointmentDate(appointmentForm.getAppointmentDate());
		appointmentBo.setDoctorNo(appointmentForm.getDoctorNo());
		appointmentBo.setPatientNo(appointmentForm.getPatientNo());

		appointmentDao.saveAppointment(appointmentBo);

	}

	public void setPatientDao(PatientDao patientDao) {
		this.patientDao = patientDao;
	}

	public void setAppointmentDao(AppointmentDao appointmentDao) {
		this.appointmentDao = appointmentDao;
	}

}
