package com.yjp.demo.controller;

import com.yjp.demo.entity.ConfigBean;
import com.yjp.demo.entity.TestConfigBean;
import com.yjp.demo.entity.TestProperties;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class IndexController {
	@Autowired
	private TestProperties testProperties;
	@Autowired
	private ConfigBean configBean;
	@Autowired
	private TestConfigBean testConfigBean;
	
	@RequestMapping("/")
	String index() {
		return
		testConfigBean.getName()+","+
		testConfigBean.getAge()+","+
		configBean.getName()+","+
		configBean.getTitle()+","+
		configBean.getWholeTitle()+","+
		testProperties.getName()+","+
		testProperties.getTitle();
	}
}
