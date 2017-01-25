package com.naver.blog.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.blog.dao.MemberDao;
import com.naver.blog.valueObject.Member;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	@Override
	public int memberAdd(Member member) {
		// TODO Auto-generated method stub
		return memberDao.insertMember(member);
	}


}
