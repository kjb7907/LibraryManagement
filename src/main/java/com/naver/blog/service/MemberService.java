package com.naver.blog.service;

import java.util.List;

import com.naver.blog.valueObject.Admin;
import com.naver.blog.valueObject.Member;

//회원과 관련된 클래스를 위한 service 인터페이스
public interface MemberService {
	int memberAdd(Member member);				//회원가입시 회원데이터 입력
	Member selectOneMember(String memberId);	//아이디로 하나의회원 조회
	int adminLogin(Admin admin); 				//관리자로그인
	List<Member> memberlevelup();				//회원비 미입금 회원 리스트
	int memberlevelupdate(String id);					//미입금회원 입금회원 전환처리
}
