import java.util.Scanner;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		Header();
		int i=1;
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String fname = readFile.next().substring(0,1).toUpperCase();
			String lname = readFile.next();
			double grade = readFile.nextDouble();
			readFile.next();
			System.out.println(i+"."+"\t"+id+"\t"+Level(id)+"\t"+fname+"."+lname+"\t"+grade+"\t"+Status(grade));
			i++;
		}
		
		readFile.close();
	}
		public static String Status(double gradestatus) {
			if(gradestatus > 2.00) {
				return "Pass";
			}else if(gradestatus >=1.00 && gradestatus <= 2.00) {
				return "Critical";
			}else return "Retired";
		}
		public static String Level(String id) {
			int levelstu = 22-Integer.parseInt(id.substring(0, 2));
				return levelstu+"th";
			}
		
		public static void Header() {
			System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
			System.out.println("*********************************************************************");
	}

}
