package applicant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ApplicantCommunication {
	
	String response = "";
	
	public void runServer()throws IOException{
		//Local
		Socket s = new Socket("localhost", 59897);
		//192.168.1.100.59897 
		
		//Skolan
		//Socket s = new Socket("130.232.237.21", 56019);
		
		//Hemma
		//Socket s = new Socket("93.106.111.2", 61360);
		
		
		PrintWriter pr = new PrintWriter(s.getOutputStream());

		pr.println("Is it working?");
		pr.flush();

		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);

		String str = bf.readLine();
		response = str;
		System.out.println("Server: " + str);
	}
	
	public String getResponse() {
		return this.response;
	}

	
}
