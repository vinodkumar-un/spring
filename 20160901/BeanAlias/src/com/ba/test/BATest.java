package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Address;

public class BATest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ba/common/application-context.xml"));
		/*Address address = factory.getBean("505,Mithrivanam", Address.class);
		System.out.println(address);*/
		String[] aliases = factory.getAliases("address1");
		for(String alias : aliases) {
			System.out.println(alias);
		}
		
	}
}






