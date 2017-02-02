package com.naver.blog.service;

//도서관 관련된 클래스를 위한 service 인터페이스
import java.util.List;

import com.naver.blog.valueObject.Book;
import com.naver.blog.valueObject.Lib;
import com.naver.blog.valueObject.Rental;
import com.naver.blog.valueObject.SearchVO;

public interface LibService {
	int bookAdd(Book book);						//도서등록
	int rentalBook(Rental rental);				//도서대여
	int returnBook(Rental rental);				//도서 반납
	List<Lib> importLib();						//도서관정보 리스트 가져오기
	Rental oneSelectRental(int rentalCode);		//하나의 대여정보 대여코드로 조회
	List<Book> bookSearch(SearchVO searchVo);	//검색조건에 일치하는 도서정보리스트 가져오기
	
}
