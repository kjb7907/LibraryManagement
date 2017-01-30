package com.naver.blog.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.blog.controller.LibController;
import com.naver.blog.dao.LibDao;
import com.naver.blog.valueObject.Book;
import com.naver.blog.valueObject.Rental;

@Service
public class LibServiceImpl implements LibService {

	private static final Logger logger = LoggerFactory.getLogger(LibServiceImpl.class);
	
	@Autowired
	LibDao libDao;
	
	//도서 등록
	@Override
	public int bookAdd(Book book) {
		logger.debug("bookAdd");
		return libDao.insertbook(book);
	}

	//도서 대여
	@Override
	public int rentalBook(Rental rental) {
		logger.debug("rentalBook");
		libDao.insertRental(rental); //대여
		libDao.insertPayMent(rental); //결제
		libDao.updateBookStatus(rental.getBookCode()); //대여상태 불가능으로 변경
		libDao.updateMemberRentCount(rental.getMemberId()); //회원대여카운트 증가
		return 0;
	}

}
