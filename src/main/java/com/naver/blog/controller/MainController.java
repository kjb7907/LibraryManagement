package com.naver.blog.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	//메인페이지
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String main(){
		return "main";
	}
	//회원가입화면
	@RequestMapping(value = "memberadd", method = RequestMethod.GET)
	public String memberadd(){
		return "memberadd";
	}
	//로그인화면
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	
}
