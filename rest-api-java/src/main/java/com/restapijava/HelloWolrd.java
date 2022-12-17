package com.restapijava;

public class HelloWolrd {

	private final long id;
	private final String content;
	
	
	public HelloWolrd(long id, String content) {
		
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	
	public String getContentString() {
		return content;
	}
	
}
