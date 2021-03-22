package com.demo.controller;

import com.demo.service.ImportService;
import com.demo.service.ScanServcie;
import com.demo.service.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class DemoController {

	@Autowired
	private ImportService importService;

	@Resource
	private ScanServcie scanServcie;

	@Resource
	public BeanService selectorBean;


}
