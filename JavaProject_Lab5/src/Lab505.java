import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input fullname : ");
		String Fullname = scan.nextLine();
		
		System.out.println();
		for(int i=0;i<Fullname.length();i++) {
			if (Fullname.charAt(i)==' ') {
				System.out.println(Fullname);
			}else {
			System.out.print(Fullname.charAt(i));
			}
		}
		
		
	}

}
