package com.naver.blog.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.blog.controller.MemberController;
import com.naver.blog.dao.MemberDao;
import com.naver.blog.valueObject.Member;

@Service
public class MemberServiceImpl implements MemberService{

	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Autowired
	private MemberDao memberDao;
	
	
	//회원가입 memberAdd
	@Override
	public int memberAdd(Member member) {
		
		logger.debug("memberAdd Service");
		return memberDao.insertMember(member);
	}


}
