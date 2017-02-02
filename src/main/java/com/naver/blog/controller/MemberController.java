package com.naver.blog.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.naver.blog.dao.MemberDaoImpl;
import com.naver.blog.service.MemberService;
import com.naver.blog.service.MemberServiceImpl;
import com.naver.blog.valueObject.Admin;
import com.naver.blog.valueObject.Member;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	
	@Autowired
	MemberServiceImpl memberService;
	
	//미입금회원 입금회원 전환 처리
	@RequestMapping(value = "memberlevelupdate", method = RequestMethod.GET)
	public String memberlevelupdate(
			@RequestParam(value = "id") String id){
		logger.debug("memberlevelupdate process");
		memberService.memberlevelupdate(id);
		return "redirect:/memberlevelup";
	}
	
	//미입금회원 입금회원 전환 페이지
	@RequestMapping(value = "memberlevelup", method = RequestMethod.GET)
	public String memberlevelup(Model model){
		logger.debug("memberlevelup");
		model.addAttribute("list", memberService.memberlevelup());
		return "memberlevelup";
	}
	
	
	//id로 하나의 회원 조회
	@RequestMapping(value = "selectOneMember", method = RequestMethod.GET)
	public @ResponseBody Member selectOneMember(
			@RequestParam(value = "memberId") String memberId){
		logger.debug("selectOneMember");
		Member member=memberService.selectOneMember(memberId);
		return member;
	}
	
	//메인페이지
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String main(){
		logger.debug("main page");
		return "main";
	}
	
	//관리자로그인화면
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(){
		logger.debug("login form");
		return "login";
	}
	
	//관리자로그인 process
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpSession session,Admin admin){
		logger.debug("login process");
		logger.debug(admin.toString());
		int result = 0;
		result = memberService.adminLogin(admin);
		if(result==1){
			session.setAttribute("LEVEL", "관리자");
			return "redirect:/main";
		}
		return "login";
	}
	
	//관리자 로그아웃 process
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session){
		logger.debug("logout process");
		session.invalidate();
		return "redirect:main";
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
