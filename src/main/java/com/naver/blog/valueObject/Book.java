package com.naver.blog.valueObject;

//도서정보 및 대여정보를 위한 클래스
public class Book {
	private int bookCode;				//도서코드
	private String libCode;				//도서관코드
	private Lib lib;					//도서관
	private String bookName;			//도서명
	private String writer;				//작가
	private String publisher;			//출판사
	private String category;			//카테고리
	private String genre;				//장르
	private String bookLocation;		//위치
	private String currentStatus;		//현재대여여부
	private String firstRentDay;		//최초대여일
	private int rentalCount;			//대여카운트
	private int rentalDays;				//대여일
	
	
	@Override
	public String toString() {
		return "Book [libCode=" + libCode + ", bookName=" + bookName + ", writer=" + writer + ", publisher=" + publisher
				+ ", category=" + category + ", genre=" + genre + ", bookLocation=" + bookLocation + "]";
	}

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public String getLibCode() {
		return libCode;
	}

	public void setLibCode(String libCode) {
		this.libCode = libCode;
	}

	public Lib getLib() {
		return lib;
	}

	public void setLib(Lib lib) {
		this.lib = lib;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getBookLocation() {
		return bookLocation;
	}

	public void setBookLocation(String bookLocation) {
		this.bookLocation = bookLocation;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getFirstRentDay() {
		return firstRentDay;
	}

	public void setFirstRentDay(String firstRentDay) {
		this.firstRentDay = firstRentDay;
	}

	public int getRentalCount() {
		return rentalCount;
	}

	public void setRentalCount(int rentalCount) {
		this.rentalCount = rentalCount;
	}

	public int getRentalDays() {
		return rentalDays;
	}

	public void setRentalDays(int rentalDays) {
		this.rentalDays = rentalDays;
	}

}
