import javax.swing.*;
public class Lab_Example702 {

	public static void main(String[] args) {
	int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	
	double itemPrice = 0.0;//get price
	boolean validItem = false;//check found or not
	int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("" + "Enter item number to order"));
	//for of search data
	for(int i=0; i<validValues.length;i++) {
		if(itemOrder == validValues[i]) { 
			validItem = true;
			itemPrice = price[i];
		}
			
	}//end of for
	
	//display data
	if(validItem) {
		System.out.println("item "+itemOrder+" is "+itemPrice);
	}
	else {
		System.out.println("Invalid Item");
	}
	}
	
}
