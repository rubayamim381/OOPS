package com.practice.access.child;
import com.practice.access.TestB;

public class TestE extends TestB{

	public static void main(String[] args) {
		TestB B = new TestB();
		B.methodPublic();
		
		//compile time-error
		//B.methodProtected();
		//but,
		
		TestE E = new TestE();
		E.methodProtected();
		
	}

}
