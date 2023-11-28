import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		//define object for input data from keyboard
		Scanner scan = new Scanner(System.in);
		
		//display message and input data first number
		System.out.print("input a number : ");
		int previousNumber = scan.nextInt();
		
		int currentNumber;
		
		//loop for input next number
		while(true) {
			System.out.print("input a number : ");
			currentNumber = scan.nextInt();
			if (currentNumber < previousNumber) {
				System.out.println();
				System.out.println("BYE BYE");
				break;
			}
			previousNumber = currentNumber;
		}
		
		
		
		
		
		
	}

}
