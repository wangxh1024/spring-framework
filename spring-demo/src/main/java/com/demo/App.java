package com.demo;

import com.demo.config.BeansConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class App {


	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);

	}

}
