package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class qqq {
	@RequestMapping("/qqq")
	public String qqq(){
		return "hello word!!!!!!!!!";
	}

}
