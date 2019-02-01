package com.thq.demo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	private Log log = LogFactory.getLog(UserController.class);

	@RequestMapping("/getUser")
	@ResponseBody
	public String getUser() {
		return "abc";
	}
}