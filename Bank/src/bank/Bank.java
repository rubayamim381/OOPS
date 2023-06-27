package bank;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Account {
	public String name;
	protected String email;
	private String password;
	
	public String generateRandomPassword() {
		
		Random random = new Random();  
	    IntStream r=random.ints(9, 50, 90);
	    Stream<String> stream = r.mapToObj(i -> String.valueOf(i));
	    String randomPassword = stream.collect(Collectors.joining());
	    
	    return randomPassword;
	}
	
	public String getPassword() {
		password = generateRandomPassword();
		setPassword(password);
		return this.password;
	}
	
	//if we want to give the user any random password, we need to use private class
	private void setPassword(String password) {
		this.password = password;
	}
	
	/*	if we want to access setPassword in another class
		public void setPassword(String password) {
		this.password = password;
	}*/
}

public class Bank {
	public static void main(String args[]) {
		Account acc = new Account();
		acc.name = "Mim";
		acc.email = "mim@mail.com";
		System.out.print("Name: "+acc.name+"\nEmail: "+acc.email+"\nPassword: "+acc.getPassword());
		
	}
}