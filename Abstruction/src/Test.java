abstract class Bank{
	String name;
	
	//constructor can be made
	Bank(String n){
		this.name = n;
		System.out.print("Interest Rate of "+this.name+" is: ");
	}
	
	abstract double getRateOfInterest();
}

class SCB extends Bank{
	
	SCB(String n){
		super(n);
	}
	
	double getRateOfInterest() {
		return 7.35;
	}
}

class EBL extends Bank{
	
	EBL(String n){
		super(n);
	}
	double getRateOfInterest() {
		return 10.0;
	}
}

public class Test {

	public static void main(String[] args) {		
		SCB bank1 = new SCB("Standard Charterd Bank");
		System.out.print(bank1.getRateOfInterest()+"% \n");
		
		EBL bank2 = new EBL("Eastern Bank Limited");
		System.out.print(bank2.getRateOfInterest()+"% \n");
	}

}
