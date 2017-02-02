package com.naver.blog.valueObject;

//도서관 정보 사용을 위한 클래스
public class Lib {
	private int libCode;		//도서관코드
	private String libName;		//도서관명
	private String libLocation;	//도서관위치
	
	
	@Override
	public String toString() {
		return "Lib [libCode=" + libCode + ", libName=" + libName + ", libLocation=" + libLocation + "]";
	}
	public int getLibCode() {
		return libCode;
	}
	public void setLibCode(int libCode) {
		this.libCode = libCode;
	}
	public String getLibName() {
		return libName;
	}
	public void setLibName(String libName) {
		this.libName = libName;
	}
	public String getLibLocation() {
		return libLocation;
	}
	public void setLibLocation(String libLocation) {
		this.libLocation = libLocation;
	}
}
