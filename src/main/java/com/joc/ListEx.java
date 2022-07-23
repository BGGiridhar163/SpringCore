package com.joc;

import java.util.List;

public class ListEx {
	String question;
	List<String> ans;
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	
	public void display() {
		System.out.println("Question is : "+question);
		ans.forEach(  
					(s)-> System.out.println(s)
				);
	}
	
	

}
