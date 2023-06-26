package com.practice.access;
import com.practice.access.TestA;

public class TestB {

	public static void main(String[] args) {
		TestA A = new TestA();
		A.methodPublic();
		A.methodDefault();
		A.methodProtected();
	}
	
	public void methodPublic() {
		System.out.print("methodPublic\n");
	}
	
	protected void methodProtected() {
		System.out.print("methodProtected\n");
	}
	
	void methodDefault() {
		System.out.print("methodDefault\n");
	}
	
	private void methodPrivate() {
		System.out.print("methodPrivate\n");
	}

}
