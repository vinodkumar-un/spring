package com.ca.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import com.ca.bo.ProjectBo;
import com.ca.dao.ProjectDao;

public class CATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ca/common/application-context.xml");

		ProjectDao projectDao = context.getBean("projectDao", ProjectDao.class);
		//List<ProjectBo> projects = projectDao.getProjectsByDuration(6);
		List<ProjectBo> projects = projectDao.getAllProjects();
		System.out.println("List of projects : ");
		for (ProjectBo project : projects) {
			System.out.println(project);
		}
	}
}
