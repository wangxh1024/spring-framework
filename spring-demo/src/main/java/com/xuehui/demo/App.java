package com.xuehui.demo;

import com.xuehui.demo.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


		System.out.println(context.getBean("beanService"));
	}

}
