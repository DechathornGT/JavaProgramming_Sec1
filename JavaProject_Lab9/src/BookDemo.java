import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		Book book = new Book();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input book title	: ");
		String title = input.nextLine();
		System.out.print("Input book price	: ");
		float price = input.nextFloat();
		System.out.print("Input pubish year	: ");
		int year = input.nextInt();
		System.out.println();
		
		book.setTitle(title);
		book.setPrice(price);
		book.setPublishyear(year);
		
		System.out.println(book);
	}
		
}
