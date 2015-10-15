package com.demo.geek.domain;

/**
 * This is Demo class for testing Boot Application
 * 
 * @author pashay
 *
 */
public class Greeting {
	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
