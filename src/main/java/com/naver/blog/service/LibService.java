package com.naver.blog.service;

import java.util.List;

import com.naver.blog.valueObject.Book;
import com.naver.blog.valueObject.Lib;
import com.naver.blog.valueObject.Rental;

public interface LibService {
	int bookAdd(Book book);
	int rentalBook(Rental rental);
	int returnBook(Rental rental);
	List<Lib> importLib();
	Rental oneSelectRental(int rentalCode);
}
