package com.ebhun.ispace;

public class HelloWorld {

	private String hi = "Hi";

	private String bye = "Bye";
	
	private String hiReply = "Hello!!!";

	private String invalidString = "invalid input";
	
	private String byeReply = "See you later";

	public String sayHiBye(String input) {
		if (input.equals(hi)) {
			return hiReply;
		} else if (input.equals(bye)) {
			return byeReply;
		}
		return invalidString;
	}

}
