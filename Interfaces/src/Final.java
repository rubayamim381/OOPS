class B {
	static final int n;
	static {
		n = 5;
	}
}

public class Final {
	public static void main(String[] args) {
		// called in static way
		System.out.println(B.n);
	}
}
