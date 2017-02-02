package com.naver.blog.valueObject;

public class SearchVO {
	private String searchOption;
	private String searchValue;
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
