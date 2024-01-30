import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input title : ");
		String title = scan.nextLine();
		
		System.out.print("Input Year : ");
		int year  = scan.nextInt();
		
		FictionBook fb1 = new FictionBook(title,year);
		
		scan.nextLine();
		/*System.out.print("Input Name : ");
		String name  = scan.nextLine();
		System.out.print("Input Email : ");
		String email  = scan.nextLine();
		fb1.setAuthorName(name);
		fb1.setEmail(email);
		
		 while(!fb1.checkFormatName()) {
			System.out.print("Input Name : ");
			name  = scan.nextLine();
			fb1.setAuthorName(name);
		}
		while(!fb1.checkEmail()) {
			System.out.print("Input Email : ");
			email = scan.nextLine();
			fb1.setEmail(email);
		}*/
		System.out.print(fb1);
		
	}

}
