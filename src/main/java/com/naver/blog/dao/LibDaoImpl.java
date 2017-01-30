package com.naver.blog.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naver.blog.valueObject.Book;
import com.naver.blog.valueObject.Rental;

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
	
	//대여
	@Override
	public int insertRental(Rental rental) {
		logger.debug("insertRental");
		return sqlSession.insert(BOARD_NS+"insertRental",rental);
	}
	
	//결제처리 
	@Override
	public int insertPayMent(Rental rental) {
		logger.debug("insertPayMent");
		return sqlSession.insert(BOARD_NS+"insertPayMent",rental);
	}
	//회원 대여카운트증가
	@Override
	public int updateMemberRentCount(String id) {
		logger.debug("updateMemberRentCount");
		return sqlSession.insert(BOARD_NS+"updateMemberRentCount",id);
	}
	//도서 대여가능상태 변경
	@Override
	public int updateBookStatus(int bookCode) {
		logger.debug("updateBookStatus");
		return sqlSession.insert(BOARD_NS+"updateBookStatus",bookCode);
	}
	//도서 반납
	@Override
	public int updateReturnBook(Rental rental) {
		logger.debug("updateReturnBooks");
		return sqlSession.insert(BOARD_NS+"updateReturnBook",rental.getRentalCode());
	}
	//도서 대여가능 상태 변경 + 카운터증가
	@Override
	public int updateBookStatusCount(Rental rental) {
		logger.debug("updateBookStatusCount");
		return sqlSession.insert(BOARD_NS+"updateBookStatusCount",rental.getRentalCode());
	}

}
