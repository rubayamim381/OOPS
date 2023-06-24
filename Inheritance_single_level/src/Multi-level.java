//Multi-level inheritance
class EquiLateralTriangle extends Triangle {
	
	private double a;
	
	public EquiLateralTriangle (String name, double a){
		super(name);
		this.a = a;
	}
	
	//override method
	public double calculateArea() {
		return Math.sqrt(3)/4.0*this.a*this.a;
	}
}