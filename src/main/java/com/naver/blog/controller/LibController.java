package com.naver.blog.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.naver.blog.dao.LibDao;
import com.naver.blog.service.LibService;
import com.naver.blog.service.LibServiceImpl;
import com.naver.blog.valueObject.Book;
import com.naver.blog.valueObject.Lib;
import com.naver.blog.valueObject.Rental;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LibController {
	
	private static final Logger logger = LoggerFactory.getLogger(LibController.class);
	
	
	@Autowired
	LibService libService;
	
	//도서조회
	@RequestMapping(value = "bookreturn", method = RequestMethod.GET)
	public String bookSearch(){
		logger.debug("bookSearch form");
		return "bookearch";
	}
	
	//하나의 대여정보 대여코드로 조회
	@RequestMapping(value = "oneSelectRental", method = RequestMethod.GET)
	public @ResponseBody Rental oneSelectRental(Model model,
			@RequestParam(value = "rentalCode") int rentalCode){
		logger.debug("oneSelectRental");
		logger.debug(rentalCode+"");
		Rental rental = libService.oneSelectRental(rentalCode);
		return rental;
	}
	
	//도서반납화면
	@RequestMapping(value = "bookreturn", method = RequestMethod.GET)
	public String bookReturn(){
		logger.debug("bookreturn form");
		return "bookreturn";
	}
	//도서반납 process
	@RequestMapping(value = "bookreturn", method = RequestMethod.POST)
	public String bookReturn(Rental rental){
		logger.debug("bookreturn process");
		logger.debug(rental.toString());
		libService.returnBook(rental);
		return "main";
	}
	
	//도서대여화면
	@RequestMapping(value = "bookrental", method = RequestMethod.GET)
	public String bookRental(){
		logger.debug("bookrental form");
		return "bookrental";
	}
	//도서대여 process
	@RequestMapping(value = "bookrental", method = RequestMethod.POST)
	public String bookRental(Rental rental){
		logger.debug("bookrental process");
		logger.debug(rental.toString());
		libService.rentalBook(rental);
		return "main";
	}

	//도서등록화면
	@RequestMapping(value = "bookadd", method = RequestMethod.GET)
	public String bookadd(Model model){
		logger.debug("bookadd form");
		List<Lib> list = libService.importLib();
		model.addAttribute("list",list);
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
