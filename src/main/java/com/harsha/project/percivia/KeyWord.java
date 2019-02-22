package com.harsha.project.percivia;

import org.springframework.data.annotation.Id;

public class KeyWord {
	
	@Id
	private String id;
	private String keyword;
	private String count;
	
//	public KeyWord(String keyword, String count) {
//		this.keyword = keyword;
//		this.count = count;
//	}
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}

}
