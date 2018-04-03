package com.dt.controller;

import com.dt.form.AppointmentForm;
import com.dt.service.ManageAppointmentService;

public class AppointmentController {
	private ManageAppointmentService manageAppointmentService;

	public void newAppointment(AppointmentForm appointmentForm) {
		manageAppointmentService.newAppointment(appointmentForm);
		System.out.println("appointment created...");
	}

	public void setManageAppointmentService(
			ManageAppointmentService manageAppointmentService) {
		this.manageAppointmentService = manageAppointmentService;
	}

}
