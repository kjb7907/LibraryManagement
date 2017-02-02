package com.naver.blog.dao;

//도서관 관련된 클래스를 위한 dao 인터페이스
import java.util.List;

import com.naver.blog.valueObject.Book;
import com.naver.blog.valueObject.Lib;
import com.naver.blog.valueObject.Rental;
import com.naver.blog.valueObject.SearchVO;

public interface LibDao {
	int insertbook(Book book); 							//도서등록
	int insertRental(Rental rental);					//대여
	int insertPayMent(Rental rental);					//결제처리 
	int updateMemberRentCount(String id);				//회원 대여카운트증가
	int updateBookStatus(int bookCode);					//도서 대여가능상태 변경
	int updateReturnBook(Rental rental);				//도서 반납
	int updateBookStatusCount(Rental rental);			//도서 대여가능 상태 변경 + 카운터증가
	List<Lib> selectLib();								//도서관정보 리스트 가져오기
	Rental selectOneRental(int rentalCode);				//하나의 대여정보 대여코드로 조회
	Book selectOneBook(int bookCode);					//하나의 도서정보 도서코드로 조회
	List<Book> selectSearchBook(SearchVO searchVo);		//검색 조건에 맞는 도서리스트 가져오기
	Lib selectOneLib(int libCode);						//하나의 도서관 정보 가져오기
}
