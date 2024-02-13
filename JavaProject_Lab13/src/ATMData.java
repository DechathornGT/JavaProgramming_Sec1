import java.io.*;

public class ATMData {
	private String accountNumber;
	private String password;
	
	ATMData(String accountNumber ,String password) throws IOException{
		this.accountNumber = accountNumber;
		this.password = password;
	}
	public String getID() {
		return this.accountNumber;
	}
	public String getPass() {
		return this.password;
	}
}
