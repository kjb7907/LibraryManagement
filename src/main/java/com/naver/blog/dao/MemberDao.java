package com.naver.blog.dao;

import com.naver.blog.valueObject.Member;

//회원과 관련된 클래스를 위한 dao 인터페이스
public interface MemberDao {
	int insertMember(Member member);	//회원가입시 회원데이터 입력
}
