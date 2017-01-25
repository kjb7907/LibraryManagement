package com.naver.blog.service;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.blog.valueObject.Member;
import com.naver.dao.MemberDao;

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
