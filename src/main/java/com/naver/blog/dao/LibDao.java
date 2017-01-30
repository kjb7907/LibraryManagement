package com.naver.blog.dao;

import com.naver.blog.valueObject.Book;
import com.naver.blog.valueObject.Rental;

public interface LibDao {
	int insertbook(Book book);
	int insertRental(Rental rental);
	int insertPayMent(Rental rental);
	int updateMemberRentCount(String id);
	int updateBookStatus(int bookCode);
}
