import java.util.Scanner;

public class AuthorDemo2 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
		System.out.println("Information Author "+i);
		System.out.println("-------------------------------------------------");
		Scanner input = new Scanner(System.in);
		System.out.print("Input author name: ");
		String name = input.nextLine();
		System.out.print("Input author e-mail: ");
		String email = input.nextLine();
		Author author = new Author(name,email);
		System.out.println("-------------------------------------------------");
		}
		System.out.println();
		
	}

}
