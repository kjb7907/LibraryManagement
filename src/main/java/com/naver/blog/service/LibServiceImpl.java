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
import com.naver.blog.valueObject.SearchVO;

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
	
	//도서관정보 리스트 가져오기
	@Override
	public List<Lib> importLib() {
		logger.debug("importLib");
		
		return libDao.selectLib();
	}
	
	//하나의 대여정보 대여코드로 조회
	@Override
	public Rental oneSelectRental(int rentalCode) {
		logger.debug("oneSelectRental");
		
		Rental rental = libDao.selectOneRental(rentalCode); //대여정보 가져오기
		logger.debug(rental.toString());//가져온 대여정보 확인		
		int bookCode = rental.getBookCode(); //대여정보의 도서코드 추출
		//대여객체안의 도서코드와 일치하는 도서정보 대여객체에 세팅
		rental.setBook(libDao.selectOneBook(bookCode));
		logger.debug(rental.getBook().toString()); //가져온 도서정보 확인
		
		return rental;
	}
	
	//검색조건에 일치하는 도서정보리스트 가져오기
	@Override
	public List<Book> bookSearch(SearchVO searchVo) {
		logger.debug("bookSearch");
		
		List<Book> list = libDao.selectSearchBook(searchVo);//도서 리스트 가져오기
		//Book객체에 담긴 도서관코드와 일치하는 도서관 정보 book 객체에 세팅
		for(int i=0;i<list.size();i++){
			Book book = list.get(i); //book객체에 리스트에 담긴 객체 세팅
			Lib lib=libDao.selectOneLib(book.getLibCode()); //도서관정보 가져오기
			book.setLib(lib); //도서관정보 세팅
		}
		
		return list;
	}

	//도서폐기
	@Override
	public int bookdis(int bookCode) {
		libDao.bookdis(bookCode);
		libDao.bookdisinsert(bookCode);
		return 0;
	}

	//지점등록
	@Override
	public int libadd(Lib lib) {
		logger.debug("libadd service");
		return libDao.libadd(lib);
	}


}
