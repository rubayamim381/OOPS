abstract class Bank{
	abstract double getRateOfInterest();
}

class SCB extends Bank{
	double getRateOfInterest() {
		return 7.35;
	}
}

class EBL extends Bank{
	double getRateOfInterest() {
		return 10.0;
	}
}

public class Test {

	public static void main(String[] args) {		
		SCB bank1 = new SCB();
		System.out.print("Interest Rate of Standard Charterd Bank is: "+bank1.getRateOfInterest()+"% \n");
		EBL bank2 = new EBL();
		System.out.print("Interest Rate of Eastern Bank Limited is: "+bank2.getRateOfInterest()+"% \n");
	}

}
