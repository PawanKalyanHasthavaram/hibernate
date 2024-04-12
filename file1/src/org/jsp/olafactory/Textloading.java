package org.jsp.olafactory;

public class Textloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started text loading");
		Demo.hello();
		System.out.println("main method ended text loading");

	}
	static {
		System.out.println("Text loading class is loaded into jvm memory");
	}

}
