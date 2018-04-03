package com.dt.test;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import com.dt.controller.AppointmentController;
import com.dt.form.AppointmentForm;

public class DTTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/dt/common/application-context.xml");
		AppointmentForm af = new AppointmentForm();
		af.setAppointmentNo(1);
		af.setAppointmentDate(new Date());
		af.setPatientNo(1);
		af.setDoctorNo(2);
		af.setPatientName("John");
		af.setAge(35);
		af.setGender("M");
		AppointmentController ac = context.getBean("appointmentController",
				AppointmentController.class);
		ac.newAppointment(af);
	}
}




