package com.npjt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.npjt.bo.ProjectBo;
import com.npjt.dao.ProjectDao;

public class NPJTTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/npjt/common/application-context.xml");
		ProjectDao projectDao = context.getBean("projectDao", ProjectDao.class);
		/*List<ProjectBo> projects = projectDao.getProjectsByDuration(6);
		for(ProjectBo bo : projects) {
			System.out.println(bo);
		}*/
		
		/*String title=  projectDao.findTitleById(1);
		System.out.println("Title : "+ title);*/
		ProjectBo bo = new ProjectBo();
		bo.setProjectNo(15);
		bo.setTitle("Xyz-e");
		bo.setDescription("abc-e");
		bo.setDuration(3);
		bo.setStatus("D");
		
		int r = projectDao.saveProjectEasily(bo);
		System.out.println("records : "+ r);
	}
}















