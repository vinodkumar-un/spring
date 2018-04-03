package com.mssc.test;

import java.util.List;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mssc.bo.ProjectBo;
import com.mssc.dao.ProjectDao;

public class MSSCTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mssc/common/application-context.xml");
		ProjectDao dao = context.getBean("projectDao", ProjectDao.class);
		
		/*List<ProjectBo> projects = dao.getProjectsByTitle("a");
		for(ProjectBo bo : projects) {
			System.out.println(bo);
		}*/
		int r = dao.updateProjectDuration(1, 100);
		System.out.println("records : "+ r);
	}
}





