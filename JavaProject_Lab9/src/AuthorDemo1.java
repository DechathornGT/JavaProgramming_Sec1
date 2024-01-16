import java.util.Scanner;

public class AuthorDemo1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input author name	: ");
		String name = input.nextLine();
		System.out.print("Input author e-mail	: ");
		String email = input.nextLine();
		System.out.print("Input author gender	: ");
		char gender = input.next().charAt(0);
		Author author = new Author(name,email,gender);
		System.out.println();
		
		
		System.out.println(author);

	}

}
