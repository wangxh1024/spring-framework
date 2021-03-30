package com.demo.config;

import com.demo.service.BeanService;
import com.demo.service.ImportService;
import org.springframework.context.annotation.*;

@Configuration
@Import(value = {ImportService.class})
@ComponentScan(basePackages = "com.demo")
@EnableAspectJAutoProxy
public class BeansConfig {


	@Bean
	public BeanService beanService(){
		return new BeanService();
	}

}
