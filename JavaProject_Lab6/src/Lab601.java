import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
	}
	
	public static void inputEmail() {
	//1.input email.
	String inputemail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();
	while(inputemail.startsWith("@")||inputemail.startsWith(" ")) {
	inputemail = JOptionPane.showInputDialog("Input your e-mail,again: ");
	}
	//2.ส่งตัวแปร inputEmail ไปยัง medthod checkEmail และ return ค่ากลับ T/F.
	boolean validateEmail = checkEmail(inputemail);
	if (validateEmail == true) {
		JOptionPane.showMessageDialog(null,"Your Email is " + inputemail);
	}
	else {
		JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}
	}
	
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else return false;

	}
	
	
	
	
	
}
