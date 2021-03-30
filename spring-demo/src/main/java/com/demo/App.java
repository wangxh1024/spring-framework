package com.demo;

import com.demo.config.BeansConfig;
import com.demo.service.CalcService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class App {


	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

//		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);

		CalcService calcService = context.getBean(CalcService.class);
		calcService.add(1, 2);

//		FactoryBeanDemo factoryBeanDemo = context.getBean("&factoryBeanDemo", FactoryBeanDemo.class);
//		System.out.println(factoryBeanDemo);

	}

}