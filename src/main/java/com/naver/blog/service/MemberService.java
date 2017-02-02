package com.naver.blog.service;

import com.naver.blog.valueObject.Member;

//회원과 관련된 클래스를 위한 service 인터페이스
public interface MemberService {
	int memberAdd(Member member);			//회원가입시 회원데이터 입력
	Member selectOneMember(String memberId);	//아이디로 하나의회원 조회
}
