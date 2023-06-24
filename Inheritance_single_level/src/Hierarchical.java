//Hierarchical inheritance
class Circle extends Shape {
	
	private double radius;
	
	public Circle(String name, double r) {
		super(name);
		this.radius = r;
	}
	
	public double calculateArea() {
		return 3.14*this.radius*this.radius;		
	}
}