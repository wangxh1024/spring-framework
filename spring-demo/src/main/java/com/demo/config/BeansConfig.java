package com.demo.config;

import com.demo.service.BeanService;
import com.demo.service.ImportService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {ImportService.class})
@ComponentScan(basePackages = "com.demo.service")
public class BeansConfig {


	@Bean
	public BeanService beanService(){
		return new BeanService();
	}

}
