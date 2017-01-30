package com.naver.blog.service;

import com.naver.blog.valueObject.Book;
import com.naver.blog.valueObject.Rental;

public interface LibService {
	int bookAdd(Book book);
	int rentalBook(Rental rental);
	int returnBook(Rental rental);
}
