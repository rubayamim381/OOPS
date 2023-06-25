class Pen {
	String color;
	String type;
	String brand;
	
//	method
	public void write() {
		System.out.println("Write something with "+this.color+" pen which is "+this.type
				+" type and brand is "+this.brand+"\n");
	}
}

//another class
//checking
class Student {
	String name, id;
	int age;
	
	public void info() {
		System.out.println(this.name+" "+this.age);
	}
	
	Student(String const_name, int const_age) {
		this.name = const_name;
		this.age = const_age;
	}
}


public class OOPS{
	public static void main(String args[])
	{
		Pen pen1 = new Pen();
		pen1.color = "RED";
		pen1.type = "GEL";
		pen1.brand = "GOOD LUCK";
//		pen1.write();
		
//		new pen
		Pen pen2 = new Pen(); //non-parameterize constructor Pen()
		pen2.color = "BLUE";
		pen2.type = "BALLPOINT";
		pen2.brand = "MATADOR";
//		pen2.write();
		
//		for student
		Student s1 = new Student("mim",25); //parameterize constructor Student(param1, param2)
		s1.info();
	}
	
}