package com.demo;

import com.demo.config.BeansConfig;
import com.demo.service.FactoryBeanDemo;
import com.demo.service.ImportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class App {


	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);

		FactoryBeanDemo factoryBeanDemo = context.getBean("&factoryBeanDemo", FactoryBeanDemo.class);
		System.out.println(factoryBeanDemo);

	}

}
