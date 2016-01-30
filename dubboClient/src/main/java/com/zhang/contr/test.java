package com.zhang.contr;

import org.springframework.beans.factory.annotation.Autowired;


public class test {
	@Autowired
	private com.zhang.service.demo demo;
	
	public String testD(){
		return demo.sayHello();
	}
}
