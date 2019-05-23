package object;

import java.io.Serializable;

public class Employer implements Serializable {
	
	String name;
	String emailUserName;
	String password;
	
	String favProgArea;
	String experience;
	int prefSalary;
	
	String prog1;
	String prog2;
	String prog3;
	
	int progSkill1;
	int progSkill2;
	int progSkill3;
	
	public Employer(String name, String emailUserName, String password, 
			String favProgArea, String experience, int prefSalary, 
			String prog1, String prog2, String prog3, 
			int progSkill1, int progSkill2, int progSkill3) {
		
		this.name = name;
		this.emailUserName = emailUserName;
		this.password = password;
		
		this.favProgArea = favProgArea;
		this.experience = experience;
		this.prefSalary = prefSalary;
		
		this.prog1 = prog1;
		this.prog2 = prog2;
		this.prog3 = prog3;
		
		this.progSkill1 = progSkill1;
		this.progSkill2 = progSkill2;
		this.progSkill3 = progSkill3;
		
	}
	
	public void showDetails() {
		System.out.println("name "+name);
	}

}
