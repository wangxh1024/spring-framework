package com.demo.controller;

import com.demo.Service.ImportService;
import com.demo.Service.ScanServcie;
import com.demo.Service.SelectorBean;
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
	public SelectorBean selectorBean;


}
