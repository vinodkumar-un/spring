package com.bppa.postprocessor;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.bppa.valueobjects.PMSValueObject;

public class ValueObjectBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		if (bean instanceof PMSValueObject) {
			((PMSValueObject) bean).setCreatedDate(new Date());
			((PMSValueObject) bean).setLastModifiedDate(new Date());
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}

}
