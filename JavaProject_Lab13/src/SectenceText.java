import java.io.*;
import java.util.*;
public class SectenceText {
	public static void main(String[] args) throws IOException {
		//create object for write data to file
		PrintStream writeFile = new PrintStream((new File("d://txtFile//sentence.txt")));
		
		//create object for input data from keyboard(console)
		Scanner input = new Scanner(System.in);
		int i = 1;
		while(true) {
			System.out.print("Sentence: ");
			String word = input.next().toUpperCase();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			
			//save data to file(write file)
			writeFile.println(i+": "+word);
			i++;
		}
		System.out.print("File is save!!");
		writeFile.close();
		
	}
}
