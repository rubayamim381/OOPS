//another class
class Student {
	String name, id;
	int age;
	
	public void info() {
		System.out.println(this.name+" "+this.age);
	}
	
	Student(Student s1) { //copy constructor
		this.name = s1.name;
		this.age = s1.age;
	}
	
	Student(String name, int age){ //parameterize constructor
		this.name = name;
		this.age = age;
	}
}


public class OOPS{
	public static void main(String args[])
	{	
		Student s1 = new Student("akash",25);
		Student s2 = new Student(s1); //assign s1 properties to s2
		s1.info();
		s2.info();
	}
	
}