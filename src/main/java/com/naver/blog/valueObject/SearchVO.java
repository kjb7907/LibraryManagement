package com.naver.blog.valueObject;

//검색을 위한 클래스
public class SearchVO {
	private String searchOption;	//검색옵션
	private String searchValue;		//검색키워드
	
	
	@Override
	public String toString() {
		return "SearchVO [searchOption=" + searchOption + ", searchValue=" + searchValue + "]";
	}
	public String getSearchOption() {
		return searchOption;
	}
	public void setSearchOption(String searchOption) {
		this.searchOption = searchOption;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

}
