package com.naver.blog.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.blog.controller.MemberController;
import com.naver.blog.dao.MemberDao;
import com.naver.blog.valueObject.Admin;
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

	//아이디로 하나의회원 조회
	@Override
	public Member selectOneMember(String memberId) {
		logger.debug("selectOneMember");
		return memberDao.selectOneMember(memberId);
	}

	//관리자로그인
	@Override
	public int adminLogin(Admin admin) {
		logger.debug("adminLogin");
		int result =0;
		Admin rAdmin =memberDao.adminLogin(admin);
		if(rAdmin.getAdminId().equals(admin.getAdminId())){
			logger.debug("아이디일치");
			if(rAdmin.getAdminPw().equals(admin.getAdminPw())){
				logger.debug("비밀번호일치");
				result=1;
			}
		}
		return result;
	}

	//회원비 미입금 회원 리스트
	@Override
	public List<Member> memberlevelup() {
		return memberDao.memberlevelup();
	}

	//미입금회원 입금회원 전환처리
	@Override
	public int memberlevelupdate(String id) {
		return memberDao.memberlevelupdate(id);
	}






}
