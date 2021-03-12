package com.xuehui.demo.config;

import com.xuehui.demo.dao.BeanDao;
import com.xuehui.demo.service.BeanService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.xuehui.demo")
@EnableAspectJAutoProxy
@Import(value = {BeanService.class})
public class AppConfig {

	@Bean
	public BeanDao beanDao(){
		return new BeanDao();
	}

}
