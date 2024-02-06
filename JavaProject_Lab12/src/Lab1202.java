import java.util.Scanner;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		Scanner input = new Scanner(System.in); 
		System.out.print("Input Email: ");
		String Email = input.next().toLowerCase();
		while(readFile.hasNext()) {
			readFile.next();
			readFile.next();
			String password = readFile.next();
			String email = readFile.next();
			if(Email.equals(email)) {
				System.out.println("Password is "+password);
				
			}else System.out.print("Data not found....");
			break;
		}
		readFile.close();
	}

}
