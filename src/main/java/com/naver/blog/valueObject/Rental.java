package com.naver.blog.valueObject;

//대여정보 조회 및 입출력을 위한 클래스
public class Rental {
	private String rentalCode;			//대여코드
	private Book book;					//대여한책
	private int bookCode;				//도서관리코드
	private String memberId;			//대여자 id
	private String rentalStartDay;		//대여 시작일
	private String returnExpectDay;		//반납 예정일
	private int rentalPrice;			//대여금액
	private String returnDay;			//반납일
	private String returnStatus; 		//반납상태
	
	
	@Override
	public String toString() {
		return "Rental [rentalCode=" + rentalCode + ", book=" + book + ", bookCode=" + bookCode + ", memberId="
				+ memberId + ", rentalStartDay=" + rentalStartDay + ", returnExpectDay=" + returnExpectDay
				+ ", rentalPrice=" + rentalPrice + ", returnDay=" + returnDay + ", returnStatus=" + returnStatus + "]";
	}
	public String getRentalCode() {
		return rentalCode;
	}
	public void setRentalCode(String rentalCode) {
		this.rentalCode = rentalCode;
	}
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getRentalStartDay() {
		return rentalStartDay;
	}
	public void setRentalStartDay(String rentalStartDay) {
		this.rentalStartDay = rentalStartDay;
	}
	public String getReturnExpectDay() {
		return returnExpectDay;
	}
	public void setReturnExpectDay(String returnExpectDay) {
		this.returnExpectDay = returnExpectDay;
	}
	public int getRentalPrice() {
		return rentalPrice;
	}
	public void setRentalPrice(int rentalPrice) {
		this.rentalPrice = rentalPrice;
	}
	public String getReturnDay() {
		return returnDay;
	}
	public void setReturnDay(String returnDay) {
		this.returnDay = returnDay;
	}
	public String getReturnStatus() {
		return returnStatus;
	}
	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

}
