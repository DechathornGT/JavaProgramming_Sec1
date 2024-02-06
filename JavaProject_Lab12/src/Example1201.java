import java.util.Scanner;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException {
		// Using Scanner Class for  read data from file
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(readFile.hasNext()) {
			String fname = readFile.next(); //read name from file
			//String lname = readFile.next(); //read surname from file 
			readFile.next();
			readFile.next(); //read password from file
			String email = readFile.next().toUpperCase();
			System.out.println(fname+" "+"("+email+")"); //read email from file
		}
		//close file
		readFile.close();
		
		
		
	}

}
