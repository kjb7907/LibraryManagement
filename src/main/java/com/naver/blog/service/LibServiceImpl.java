package com.naver.blog.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.blog.controller.LibController;
import com.naver.blog.dao.LibDao;
import com.naver.blog.valueObject.Book;
import com.naver.blog.valueObject.Lib;
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
	//도서 반납
	@Override
	public int returnBook(Rental rental) {
		logger.debug("returnBook");
		libDao.updateReturnBook(rental);//반납
		libDao.updateBookStatusCount(rental); //대여상태변경/대여카운트 증가
		
		return 0;
	}
	
	//도서관정보 가져오기
	@Override
	public List<Lib> importLib() {
		return libDao.selectLib();
	}
	
	//하나의 대여정보 대여코드로 조회
	@Override
	public Rental oneSelectRental(int rentalCode) {
		Rental rental = libDao.selectOneRental(rentalCode);
		logger.debug(rental.toString());
		int bookCode = rental.getBookCode();
		rental.setBook(libDao.selectOneBook(bookCode));
		logger.debug(rental.getBook().toString());
		return rental;
	}

}
