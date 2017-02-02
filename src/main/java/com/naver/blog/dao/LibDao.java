package com.naver.blog.dao;

import java.util.List;

import com.naver.blog.valueObject.Book;
import com.naver.blog.valueObject.Lib;
import com.naver.blog.valueObject.Rental;
import com.naver.blog.valueObject.SearchVO;

public interface LibDao {
	int insertbook(Book book);
	int insertRental(Rental rental);
	int insertPayMent(Rental rental);
	int updateMemberRentCount(String id);
	int updateBookStatus(int bookCode);
	int updateReturnBook(Rental rental);
	int updateBookStatusCount(Rental rental);
	List<Lib> selectLib();
	Rental selectOneRental(int rentalCode);
	Book selectOneBook(int bookCode);
	List<Book> selectSearchBook(SearchVO searchVo);
}
