package com.naver.blog.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.blog.dao.MemberDaoImpl;
import com.naver.blog.service.MemberService;
import com.naver.blog.service.MemberServiceImpl;
import com.naver.blog.valueObject.Member;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	
	@Autowired
	MemberServiceImpl memberService;
	
	//메인페이지
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String main(){
		logger.debug("main page");
		return "main";
	}
	
	//로그인화면
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(){
		logger.debug("login form");
		return "login";
	}
	
	//회원가입화면
	@RequestMapping(value = "memberadd", method = RequestMethod.GET)
	public String memberadd(){
		logger.debug("memberadd form");
		return "memberadd";
	}
	
	//회원가입 process
	@RequestMapping(value = "memberadd", method = RequestMethod.POST)
	public String memberadd(Member member){
		logger.debug("memberadd process");
		logger.debug(member.toString());
		memberService.memberAdd(member);
		return "main";
	}
	
}
