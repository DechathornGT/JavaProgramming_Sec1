import java.io.*;
import java.util.Scanner;
public class Lab1204 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//Bookdata.txt"));
		String tmp = "";
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter rating of books: ");
		double inputrating = input.nextDouble();
		System.out.println("--------------------------------------------");
		int i = 1,l=0;
		while((tmp = readFile.readLine()) != null) {
			String[] data = tmp.split("\t");
			double rating = Double.parseDouble(data[2]);
			if(rating>=inputrating) {
			System.out.println("Book "+i+":"+data[0]+"write by"+data[1]+" ("+data[2]+") reviews");
			l++;
			}
			i++;
		}
		
		readFile.close();
		System.out.println("--------------------------------------------");
		System.out.println("There are "+l+" book get rating more than "+inputrating);
	}

}
