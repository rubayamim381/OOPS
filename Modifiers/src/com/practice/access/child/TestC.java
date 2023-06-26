package com.practice.access.child;
import com.practice.access.TestB;

public class TestC {

	public static void main(String[] args) {
		TestB B = new TestB();
		B.methodPublic();
		
		//Default is not accessed to other package class and sub-class
		//B.methodDefault(); 
		
		//protected is accessed to other package sub-class but, not accessed to other package class
		//B.methodProtected();
	}

}
