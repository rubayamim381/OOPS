/* package whatever; // don't place package name! */

abstract class Shape2 {
	public abstract double calculateArea2();
};

//Single-level inheritance
class Triangle2 extends Shape2 {
	private double height, width;
	public Triangle2(double height, double width) {
		this.height = height;
		this.width = width;
	}
	public double calculateArea2() {
		return 0.5 * height * width;
	}
}

class Circle2 extends Shape2 {
	private double radius;
	public Circle2(double radius) {
		this.radius = radius;
	}
	public double calculateArea2() {
		return Math.acos(-1.0) * radius * radius;
	}
}


class Ideone{
	public static void main(String args[]){
		Triangle2 triangle = new Triangle2(10, 20);
		Circle2 circle = new Circle2(10);
		System.out.println("Display triangle area: " + triangle.calculateArea2());
		System.out.println("Display circle area: " + circle.calculateArea2());
	}
}
