package com.naver.blog.valueObject;

public class Book {
	private int bookCode;
	private String libCode;
	private String bookName;
	private String writer;
	private String publisher;
	private String category;
	private String genre;
	private String bookLocation;
	private String currentStatus;
	private String firstRentDay;
	private int rentalCount;
	private int rentalDays;
	
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
