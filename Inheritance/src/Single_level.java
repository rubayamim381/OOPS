//Single-level inheritance
class Triangle extends Shape {
	
	public double height, width;

	//constructor
	public Triangle(String name, double h, double w) {
		super(name);
		this.height = h;
		this.width = w;
	}
	
	// Create constructor chain for the subclass - Equilateral class 	
	public Triangle(String name) {
		super(name);
	}
	
	public double calculateArea() {
		return 1/2.0*this.height*this.width;		
	}
}