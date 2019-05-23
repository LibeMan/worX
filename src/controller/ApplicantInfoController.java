package controller;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import object.Applicant;

public class ApplicantInfoController {

	ObservableList<String> favAreaList = FXCollections.
    		observableArrayList("Game Developement", "Server Programming", "Website Design", "Frontend", "Backend", "SAAS");

    ObservableList<String> prefSalList = FXCollections.
    		observableArrayList("1000 - 1800", "1800 - 2800", "2800 - 3500", "3500 >");

    ObservableList<String> experienceList = FXCollections.
    		observableArrayList("Junior, 0-5 years","Intermediate, 5-10", "Senior, 10 +");

    ObservableList<String> progList = FXCollections.
    		observableArrayList("Java", "Python", "HTML/CSS/JavaScript", "C++");

    ObservableList<String> skillList = FXCollections.
    		observableArrayList("Beginner", "Intermediate", "Expert");

    @FXML
	private TextField nameField;


    @FXML
	private TextField emailUserNameField;


    @FXML
	private TextField passwordField;


    @FXML
    private ChoiceBox favProgBox;


    @FXML
    private ChoiceBox prefSalBox;


    @FXML
    private ChoiceBox experienceBox;


    @FXML
    private ChoiceBox progLang1;


    @FXML
    private ChoiceBox progLang2;


    @FXML
    private ChoiceBox progLang3;


    @FXML
    private ChoiceBox progSkill1;


    @FXML
    private ChoiceBox progSkill2;


    @FXML
    private ChoiceBox progSkill3;




    @FXML
    private void initialize() {
    	favProgBox.setItems(favAreaList);
    	prefSalBox.setItems(prefSalList);
    	experienceBox.setItems(experienceList);
    	progLang1.setItems(progList);
    	progLang2.setItems(progList);
    	progLang3.setItems(progList);
    	progSkill1.setItems(skillList);
    	progSkill2.setItems(skillList);
    	progSkill3.setItems(skillList);

    }


	/*public void changeScreenButtonPushed(ActionEvent event) throws IOException {

		Socket s = new Socket("130.232.236.60", 62509);

		ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());

		Applicant applicant1 = new Applicant(name, user, password, favProg, experience,
				prefSal, prog1, prog2, prog3, progskil1, progskil2, progskil3);

        Parent tableViewParent = FXMLLoader.load(getClass().getResource("ApplicantDesign.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }*/

	public void createApplicant(ActionEvent event) throws IOException {
		String name = nameField.getText();
		String user = emailUserNameField.getText();
		String password = passwordField.getText();
		String favProg = (String) favProgBox.getValue();
		String prefSal = (String) prefSalBox.getValue();
	    String experience = (String) experienceBox.getValue();
	    String prog1 = (String) progLang1.getValue();
	    String prog2 = (String) progLang2.getValue();
	    String prog3 = (String) progLang3.getValue();
	    String progskil1 = (String) progSkill1.getValue();
	    String progskil2 = (String) progSkill2.getValue();
	    String progskil3 = (String) progSkill3.getValue();

		Applicant applicant1 = new Applicant(name, user, password, favProg, experience,
				prefSal, prog1, prog2, prog3, progskil1, progskil2, progskil3);

		System.out.println(applicant1);
		applicant1.showDetails();

		//Connectar till servern och skickar objectet
		Socket s = new Socket("localhost", 62509);
		ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
		os.writeObject(applicant1);
		s.close();
	}

}
