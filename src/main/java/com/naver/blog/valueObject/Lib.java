package com.naver.blog.valueObject;

public class Lib {
	private int libCode;
	private String libName;
	private String libLocation;
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
