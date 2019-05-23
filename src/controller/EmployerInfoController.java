package controller;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import object.Applicant;
import object.Employer;

public class EmployerInfoController {
	
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
	private TextField emailField;
    
    @FXML
	private TextField userNameField;
    
    @FXML
	private TextField passwordField;
    
    @FXML
    private ChoiceBox progAreaBox;
    
    @FXML
    private ChoiceBox experienceBox;
    
    @FXML
    private ChoiceBox progLang1;
    
    @FXML
    private ChoiceBox progLang2;
    
    @FXML
	private TextField approxSalaryField;
    
    @FXML
   	private TextArea descriptionField;
    

    
    @FXML
    private void initialize() {
    	progAreaBox.setItems(favAreaList);
    	experienceBox.setItems(experienceList);
    	progLang1.setItems(progList);
    	progLang2.setItems(progList);
    	

    }
    
    /*public void changeScreenButtonPushed(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource(".fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(tableViewScene);
        window.show();
    }*/
    
    public void createEmployer(ActionEvent event) throws IOException {
		String name = nameField.getText();
		String email = emailField.getText();
		String user = userNameField.getText();
		String password = passwordField.getText();
		String favProg = (String) progAreaBox.getValue(); 
	    String experience = (String) experienceBox.getValue();
	    String prog1 = (String) progLang1.getValue();
	    String prog2 = (String) progLang2.getValue();
	    String salary = approxSalaryField.getText();
	    String companyDescription = descriptionField.getText();

	    
		Employer employer1 = new Employer(name, email, user, password, favProg, experience,
				 prog1, prog2, salary, companyDescription);
		
		System.out.println(employer1);
		employer1.showDetails();
		
		Parent tableViewParent = FXMLLoader.load(getClass().getResource("/app/EmployerAppDesign.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(tableViewScene);
        window.show();
	}

}
