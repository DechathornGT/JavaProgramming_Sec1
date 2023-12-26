import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		String fullname;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space. \n:");
		fullname = input.nextLine();
		System.out.println(abbreviatName(fullname));
	}//end
	
	public static String abbreviatName(String fname) {
		String firstName = fname.substring(0, fname.indexOf(' '));
		String middleName = fname.substring(fname.indexOf(' ')+1,fname.indexOf(' ')+2);
		String lastName = fname.substring(fname.lastIndexOf(' ')+1,fname.lastIndexOf(' ')+2);
		return middleName + "." +lastName + "." + firstName;
		
	}
}

