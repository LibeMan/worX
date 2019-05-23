package controller;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import object.Applicant;

public class StartWindowController  {

	@FXML
	private TextField username;
	@FXML
	private TextField password;

	public void sendToPort(ActionEvent event) throws IOException, ClassNotFoundException {
		// need host and port, we want to connect to the ServerSocket at port 7777
        Socket socket = new Socket("localhost", 62509);
        System.out.println("Connected!");

        // get the output stream from the socket.
        OutputStream outputStream = socket.getOutputStream();
        // create a data output stream from the output stream so we can send data through it
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);


        // write the message we want to send
        dataOutputStream.writeUTF("KeyUserPass");
        dataOutputStream.flush(); // send the message
       // dataOutputStream.close(); // close the output stream when we're done.


        String email = username.getText();
		String passwd = password.getText();


        // write the Username and password
        dataOutputStream.writeUTF(email);
        dataOutputStream.flush(); // send the message
        dataOutputStream.writeUTF(passwd);
        dataOutputStream.flush(); // send the message

        dataOutputStream.close(); // close the output stream when we're done.

        System.out.println("Closing socket and terminating program.");
        socket.close();
        recieveLogin();

	}

	public void recieveLogin() throws IOException, ClassNotFoundException{

		Socket s=new Socket("localhost",62826);
		ObjectInputStream is=new ObjectInputStream(s.getInputStream());
		Applicant sa=(Applicant)is.readObject();
		sa.showDetails();
		System.out.println("WORKED!!!");
		s.close();

	}


	public void applicantInfoButton(ActionEvent event) throws IOException {

		Parent tableViewParent = FXMLLoader.load(getClass().getResource("ApplicantDesign.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

	public void employerInfoButton(ActionEvent event) throws IOException {

		Parent tableViewParent = FXMLLoader.load(getClass().getResource("EmployerDesign.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }



}
