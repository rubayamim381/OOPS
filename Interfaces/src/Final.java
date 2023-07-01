class B {
	//static final variable and method
	static final int n;
	static {
		n = 5;
	}

	static final void run() {
		System.out.println("Satic final test and final var is: "+B.n);
	}
	
	//non-static final variable and method
	final int m;

	B(){
		m=15;
	}
	final void display() {
		System.out.println("non-static final test and final var is: "+m);
	}
}

class C extends B{
	
}

public class Final{
	public static void main(String[] args) {
		// if we use static, the variable and method should be called in static way
		System.out.println(B.n);
		B.run();
		
		//if we called final, they should be called in creating object
		C c = new C();
		c.display();
		
		B b = new B();
		b.display();
	}
}
