package com.naver.blog.valueObject;

public class Admin {
	private String AdminId;
	private String AdminPw;
	@Override
	public String toString() {
		return "Admin [AdminId=" + AdminId + ", AdminPw=" + AdminPw + "]";
	}
	public String getAdminId() {
		return AdminId;
	}
	public void setAdminId(String adminId) {
		AdminId = adminId;
	}
	public String getAdminPw() {
		return AdminPw;
	}
	public void setAdminPw(String adminPw) {
		AdminPw = adminPw;
	}

}
