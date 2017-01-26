package com.naver.blog.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.blog.controller.LibController;
import com.naver.blog.dao.LibDao;
import com.naver.blog.valueObject.Book;

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

}
