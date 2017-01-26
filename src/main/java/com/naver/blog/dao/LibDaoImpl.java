package com.naver.blog.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naver.blog.valueObject.Book;

@Repository
public class LibDaoImpl implements LibDao{

	private static final Logger logger = LoggerFactory.getLogger(LibDaoImpl.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String BOARD_NS = "com.naver.blog.LibMapper.";
	
	//도서등록
	@Override
	public int insertbook(Book book) {
		logger.debug("insertbook");
		return sqlSession.insert(BOARD_NS+"insertBook",book);
	}

}
