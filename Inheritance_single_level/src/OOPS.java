abstract class Shape {
	String name;
	public Shape(String name) {
		this.name = name;
		System.out.println("...Shape of Geometry: "+this.name+"...");
	}
	public abstract double calculateArea();
}

//Single-level
//Multi-level
//Hierarchical

public class OOPS{
	public static void main(String args[]){
		
		double areaTri, areaEquilTri, areaCircle;

		Triangle tiangle = new Triangle("Triangle",10,20);		
		areaTri = tiangle.calculateArea();
		System.out.println("Dispaly triangle area: " + areaTri+"\n");
		
		EquiLateralTriangle equilTriangle = new EquiLateralTriangle("EquiLateral Triangle",4);
		areaEquilTri = equilTriangle.calculateArea();
		System.out.println("Dispaly Equilateral Triangle area: " + areaEquilTri+"\n");
		
		Circle circleArea = new Circle("Circle",4);
		areaCircle = circleArea.calculateArea();
		System.out.println("Dispaly circle area: " + areaCircle+"\n");

	}
}