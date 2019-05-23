package object;

import java.io.Serializable;

public class Employer implements Serializable {
	
	String name;
	String email;
	String userName;
	String password;
	
	String favProgArea;
	String experience;
	
	String prog1;
	String prog2;
	
	String salary;
	String companyDescription;
	
	
	public Employer(String name, String email, String userName, String password, 
			String favProgArea, String experience,  String prog1, String prog2, String salary, String companyDescription) {
		
		this.name = name;
		this.email = email;
		this.userName = userName;
		this.password = password;
		
		this.favProgArea = favProgArea;
		this.experience = experience;
		
		this.prog1 = prog1;
		this.prog2 = prog2;
		
		this.salary = salary;
		this.companyDescription = companyDescription;
		
	}
	
	public void showDetails() {
		System.out.println("Company Name: " + name + "\n" +  
				"Company Email: " + email + "\n" + 
				"Username: " + userName + "\n" + 
				"Password: " + password + "\n" + 
				"Programming Area: " + favProgArea + "\n" + 
				"Experience in Area: " + experience + "\n" + 
				
				"\n" + " Required Programming Skills" + "\n" +
				"Main Language: " + prog1  + "\n" + 
				"Good To Know Language: " + prog2  + "\n" +
				"\n" + "Approximate Salary: " + salary +  "\n" + 
				"\n" + "Company Description:" +  "\n" + companyDescription
				);
	}

}
