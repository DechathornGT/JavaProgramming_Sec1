import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		
		if(message.toLowerCase().indexOf("nichi")>=0) 
			{
			System.out.print("Nichi is centence");
			}
		else 
		{
			System.out.print(message);
		}
		
		
		
	}

}
