package com.naver.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.blog.service.LibService;
import com.naver.blog.service.LibServiceImpl;
import com.naver.blog.valueObject.Book;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LibController {
	
	private static final Logger logger = LoggerFactory.getLogger(LibController.class);
	
	
	@Autowired
	LibService libService;
	
	//도서대여화면
	@RequestMapping(value = "bookrental", method = RequestMethod.GET)
	public String bookRental(){
		logger.debug("bookrental form");
		return "bookrental";
	}

	//도서등록화면
	@RequestMapping(value = "bookadd", method = RequestMethod.GET)
	public String bookadd(){
		logger.debug("bookadd form");
		return "bookadd";
	}
	//도서등록 process
	@RequestMapping(value = "bookadd", method = RequestMethod.POST)
	public String bookadd(Book book){
		logger.debug("bookadd process");
		logger.debug(book.toString());
		libService.bookAdd(book);
		return "main";
	}

	
}
