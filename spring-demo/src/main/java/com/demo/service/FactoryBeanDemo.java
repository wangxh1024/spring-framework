package com.demo.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanDemo implements FactoryBean {

	@Override
	public Object getObject() throws Exception {
		return new SubFactoryBeanDemo();
	}

	@Override
	public Class<?> getObjectType() {
		return SubFactoryBeanDemo.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
