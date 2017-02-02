package com.naver.blog.valueObject;

//회원가입및 정보 조회를 위한 클래스
public class Member {
	private String id;						//아이디
	private String pw;						//비밀번호
	private String name;					//이름
	private String birth;					//생년월일
	private String phone;					//전화번호
	private String  addr;					//주소
	private String joinDay; 				//가입일
	private int libCode;					//도서관코드
	private String rentalCount; 			//대여회수
	private String memberPaymentStatus;		//회원비입금여부
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getJoinDay() {
		return joinDay;
	}
	public void setJoinDay(String joinDay) {
		this.joinDay = joinDay;
	}
	public int getLibCode() {
		return libCode;
	}
	public void setLibCode(int libCode) {
		this.libCode = libCode;
	}
	public String getRentalCount() {
		return rentalCount;
	}
	public void setRentalCount(String rentalCount) {
		this.rentalCount = rentalCount;
	}
	public String getMemberPaymentStatus() {
		return memberPaymentStatus;
	}
	public void setMemberPaymentStatus(String memberPaymentStatus) {
		this.memberPaymentStatus = memberPaymentStatus;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", birth=" + birth + ", phone=" + phone
				+ ", addr=" + addr + ", libCode=" + libCode + "]";
	}
	
}
