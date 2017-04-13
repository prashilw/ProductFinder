package org.prashil.core.demo;

public class HelloWorld {
	private String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("Initializing HelloWorld Bean");
	}
	public void destroy(){
		System.out.println("Destroying HelloWorld Bean");
	}
}
