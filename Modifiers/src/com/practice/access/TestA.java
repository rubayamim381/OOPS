package com.practice.access;

public class TestA {
	public void methodPublic() {
		methodPrivate();
	}
	
	protected void methodProtected() {
		methodPrivate();
	}
	
	void methodDefault() {
		methodPrivate();
	}
	
	private void methodPrivate() {
		System.out.print("Test A\n");
	}
}
