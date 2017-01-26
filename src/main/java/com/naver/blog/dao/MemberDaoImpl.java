package com.naver.blog.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

	
}
