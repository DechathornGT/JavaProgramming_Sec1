import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String Fullname,fristname,lastname;
		Fullname = scan.nextLine();
		int space = Fullname.trim().indexOf(" ");
		if(space==-1) {
			System.out.print("Incorrect Name");
			Fullname = scan.nextLine();
		}
		else {
			fristname = Fullname.substring(0,space).toUpperCase();
			lastname = Fullname.substring(space+1).toLowerCase();
			System.out.println("First Name: "+fristname);
			System.out.println("Last  Name: "+lastname);
		}
		
		
		
		
		
		
	}

}
