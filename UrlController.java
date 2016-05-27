//Write a simple controller using SpringMVC annotations and JAVA to
//access a get variable named “testVar”. The data type will be a String. Once
//you have accessed the variable you should remove all leading and trailing
//whitespace then make the entire string lowercase and write it to standard
//out. No need to write configuration files for Spring and this should be a full
//class but you do not need to include imports. The URI is
///javaTest/?testVar=SomeText


package com.epromos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UrlController {

	@RequestMapping(value = "/javaTest/")
	@ResponseBody
	public String parseURL(@RequestParam("testVar") String str) {
		str = str.trim().toLowerCase();
		System.out.println(str);
		return str;
	}

}