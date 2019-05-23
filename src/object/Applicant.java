package object;

import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TextField;

public class Applicant implements Serializable {

	String name;
	String emailUserName;
	String password;

	String favProgArea;
	String experience;
	String prefSalary;

	String prog1;
	String prog2;
	String prog3;

	String progSkill1;
	String progSkill2;
	String progSkill3;

	public Applicant(String name, String emailUserName, String password,
			String favProgArea, String experience, String prefSalary,
			String prog1, String prog2, String prog3,
			String progSkill1, String progSkill2, String progSkill3) {

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
		System.out.println("Name: " + name + "\n" +
				"Username: " + emailUserName + "\n" +
				"Password: " + password + "\n" +
				"Favourite Programming Area: " + favProgArea + "\n" +
				"Experience: " + experience + "\n" +
				"Preferred Salary: " + prefSalary + "\n" +
				"\n" + "Programming Skills" + "\n" +
				"Language 1: " + prog1 + " - " + progSkill1 + "\n" +
				"Language 2: " + prog2 + " - " + progSkill2 + "\n" +
				"Language 3: " +prog2 + " - " + progSkill2 + "\n");
	}

	public String getUsername(){
		return emailUserName;
	}
	public String getPassword(){
		return password;
	}


}
