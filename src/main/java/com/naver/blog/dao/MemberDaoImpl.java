package com.naver.blog.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naver.blog.valueObject.Member;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String BOARD_NS = "com.naver.blog.MemberMapper.";

	@Override
	public int insertMember(Member member) {
		
		return 0;
	}

	
}
