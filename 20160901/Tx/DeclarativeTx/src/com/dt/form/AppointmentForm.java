package com.dt.form;

import java.util.Date;

public class AppointmentForm {
	private int appointmentNo;
	private int patientNo;
	private String patientName;
	private int age;
	private String gender;
	private Date appointmentDate;
	private int doctorNo;

	public int getAppointmentNo() {
		return appointmentNo;
	}

	public void setAppointmentNo(int appointmentNo) {
		this.appointmentNo = appointmentNo;
	}

	public int getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(int patientNo) {
		this.patientNo = patientNo;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public int getDoctorNo() {
		return doctorNo;
	}

	public void setDoctorNo(int doctorNo) {
		this.doctorNo = doctorNo;
	}

}
