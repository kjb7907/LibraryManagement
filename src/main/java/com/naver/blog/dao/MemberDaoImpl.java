package com.naver.blog.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naver.blog.valueObject.Admin;
import com.naver.blog.valueObject.Member;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	private static final Logger logger = LoggerFactory.getLogger(MemberDaoImpl.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String BOARD_NS = "com.naver.blog.MemberMapper.";

	
	//회원가입 member insert
	@Override
	public int insertMember(Member member) {
		logger.debug("insertMember Dao");
		return sqlSession.insert(BOARD_NS+"insertMember",member);
	}

	//아이디로 하나의회원 조회
	@Override
	public Member selectOneMember(String memberId) {
		return sqlSession.selectOne(BOARD_NS+"selectOneMember",memberId);
	}

	//관리자로그인
	@Override
	public Admin adminLogin(Admin admin) {
		return sqlSession.selectOne(BOARD_NS+"adminLogin",admin);
	}

	//회원비 미입금 회원 리스트
	@Override
	public List<Member> memberlevelup() {
		return sqlSession.selectList(BOARD_NS+"memberlevelup");
	}

	//미입금회원 입금회원 전환처리
	@Override
	public int memberlevelupdate(String id) {
		return sqlSession.update(BOARD_NS+"memberlevelupdate",id);
	}

	
}
