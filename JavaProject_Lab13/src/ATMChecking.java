import java.io.*;
import java.util.Scanner;
public class ATMChecking extends ATMData{
	private int money;
	
	ATMChecking(String accountNumber,String password,int money) throws IOException {
		super(accountNumber,password);
		this.money = money;
	}
	public boolean checkBookBank() throws IOException{
		Scanner readFile = new Scanner(new File("d://textFile//ATMBookBank.txt"));
		
		return false;
	}
	public void show() {
		
	}
	
}
