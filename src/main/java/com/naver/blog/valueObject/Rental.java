package com.naver.blog.valueObject;

public class Rental {
	private int bookCode;				//도서관리코드
	private String memberId;			//대여자 id
	private String rentalStartDay;	//대여 시작일
	private String returnExpectDay;	//반납 예정일
	private String returnDay;			//반납일
	private String returnStatus; 		//반납상태
	
	@Override
	public String toString() {
		return "Rental [bookCode=" + bookCode + ", memberId=" + memberId + ", rentalStartDay=" + rentalStartDay
				+ ", returnExpectDay=" + returnExpectDay + "]";
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
}
