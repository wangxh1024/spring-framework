package com.demo.config;

import com.demo.Service.ImportService;
import com.demo.Service.SelectorBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {ImportService.class, SelectorBean.class})
public class BeansConfig {


}
