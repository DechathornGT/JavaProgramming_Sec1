import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		//create object for input data from keyboard(console)
		Scanner input = new Scanner(System.in);
		//create object for write data to file
		PrintStream writeFile = new PrintStream((new File("d://txtFile//employee.txt")));
		String answer;
		do {
			header(); //call header() method from Employee Class
			System.out.print("\nEnter Name: ");
			name = input.next();
			System.out.print("Enter department: ");
			dept = input.next();
			
			writeFile.println(name+"\t"+dept);
			
			System.out.print("Enter data again? : ");
			answer = input.next().toLowerCase();
		}while(answer.equalsIgnoreCase("y"));
			
		writeFile.close();
	}
	
	public void read() {
		try {
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			header();
			int i = 0;
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(name);
					check = true;
					i++;
				}
				
			}
			System.out.println("Employee in dept "+super.getDept()+" is "+i+" person.");
			if(check == false) {
				header();
				System.out.println("\nSorry, no dept : "+super.getDept()+" in file.");
			}
		}catch(IOException e){
			System.out.println("Sorry, file not found");
		}
	}
}
