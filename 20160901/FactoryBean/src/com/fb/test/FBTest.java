package com.fb.test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fb.beans.CalendarFactoryBean;
import com.fb.beans.Reminder;

public class FBTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/fb/common/application-context.xml"));
		/*
		 * Reminder reminder = factory.getBean("reminder", Reminder.class);
		 * System.out.println(reminder.getReminder());
		 */
		CalendarFactoryBean factoryBean1 = factory.getBean("&birthdayDate",
				CalendarFactoryBean.class);
		CalendarFactoryBean factoryBean2 = factory.getBean("&birthdayDate",
				CalendarFactoryBean.class);
		System.out.println("factoryBean1 == factoryBean2 ? : "
				+ (factoryBean1 == factoryBean2));

		Calendar calendar1 = factory.getBean("birthdayDate", Calendar.class);
		Calendar calendar2 = factory.getBean("birthdayDate", Calendar.class);
		System.out.println("calendar1 == calendar2 ? : "
				+ (calendar1 == calendar2));

	}
}
