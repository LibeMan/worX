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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EmployerInfoController {
	
	ObservableList<String> favAreaList = FXCollections.
    		observableArrayList("Game Developement", "Server Programming", "Website Design", "Frontend", "Backend", "SAAS");
    
    ObservableList<String> prefSalList = FXCollections.
    		observableArrayList("1000 - 1500", "1500 - 2000", "2000 - 2500", "2500 - 3000", "3000 - 3500", "4000 >");
    
    ObservableList<String> prefCountryList = FXCollections.
    		observableArrayList("Web Solutions","Finland", "Sweden", "Norway", "Denmark", "USA", "Great Britain");
    
    ObservableList<String> prefWorkList = FXCollections.
    		observableArrayList("Part Time", "Full Time", "Projects", "Paid/Internship");
    
    ObservableList<String> progList = FXCollections.
    		observableArrayList("Java", "Python", "HTML/CSS/JavaScript", "C++");
    
    @FXML
	private TextField name;
    
    @FXML
	private TextField email;
    
    @FXML
	private TextField address;
    
    @FXML
	private TextField phone;
    
    @FXML
    private ChoiceBox favProgBox;
    
    @FXML
    private ChoiceBox prefSalBox;
    
    @FXML
    private ChoiceBox prefCountryBox;
    
    @FXML
    private ChoiceBox prefWorkBox;
    
    @FXML
    private ChoiceBox progLang1;
    
    @FXML
    private ChoiceBox progLang2;
    
    @FXML
    private ChoiceBox progLang3;
    
    @FXML
    private ChoiceBox progLang4;

    
    @FXML
    private void initialize() {
    	favProgBox.setItems(favAreaList);
    	prefSalBox.setItems(prefSalList);
    	prefCountryBox.setItems(prefCountryList);
    	prefWorkBox.setItems(prefWorkList);
    	progLang1.setItems(progList);
    	progLang2.setItems(progList);
    	progLang3.setItems(progList);
    	progLang4.setItems(progList);
    	

    }
    
    public void changeScreenButtonPushed(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource(".fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(tableViewScene);
        window.show();
    }

}
