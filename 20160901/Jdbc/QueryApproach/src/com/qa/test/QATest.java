package com.qa.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qa.bo.ProjectBo;
import com.qa.bo.ProjectResourcesBo;
import com.qa.dao.ProjectDao;

public class QATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/qa/common/application-context.xml");
		ProjectDao projectDao = context.getBean("projectDao", ProjectDao.class);
		/*
		 * int noOfProjects = projectDao.getNoOfProjects();
		 * System.out.println("projects : "+ noOfProjects);
		 */
		/*
		 * String title = projectDao.getProjectTitle(1);
		 * System.out.println("Title : "+ title);
		 */
		/*
		 * ProjectBo bo = projectDao.getProject(2); System.out.println(bo);
		 */

		/*
		 * List<ProjectBo> projects= projectDao.getAllProjects(); for(ProjectBo
		 * bo : projects) { System.out.println(bo); }
		 */

		/*List<Map<String, Object>> projects = projectDao.getProjectsByTitle("a");
		for (Map<String, Object> row : projects) {
			for (String key : row.keySet()) {
				System.out.print(key + "- " + row.get(key));
			}
			System.out.println();
		}*/
		/*List<ProjectResourcesBo> projectResources = projectDao.getProjectsAndResources();
        for(ProjectResourcesBo bo : projectResources) {
        	System.out.println(bo);
        }*/
		/*List<ProjectBo> projects = projectDao.getProjects(3, 3);
		for(ProjectBo bo : projects) {
			System.out.println(bo);
		}*/
		ProjectBo bo = new ProjectBo();
		bo.setTitle("Swach Bharath Project");
		bo.setDuration(10000);
		bo.setDescription("SBP");
		bo.setStatus("D");
		Object r = projectDao.insertProjectAndGetProjectNo(bo);
		System.out.println("projectNo : "  + r);
	}
}






