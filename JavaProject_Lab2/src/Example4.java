import java.text.DecimalFormat;

import javax.swing.JOptionPane;//1.import library for input data from dialog box
public class Example4 {

	public static void main(String[] args) {
		//2. input data from dialog box
		String productName = JOptionPane.showInputDialog("Input Product Name : ");
		
	/*	//input unit price from dialogbox
		String strUnit = JOptionPane.showInputDialog("Input Product Unit : ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit);
	*/
		//input and convert data from dialog box
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Unit : "));
		
		//input price per unit from dialog box
		String strPrice = JOptionPane.showInputDialog("Input Price per unit :") ;
		float pricePerUnit = Float.parseFloat(strPrice);
		
		//calculate total price
		float totalPrice = productUnit * pricePerUnit;
		
		//display data to dialog box
		DecimalFormat frm = new DecimalFormat("#,###.00");
		float vat = totalPrice+(totalPrice*7/100);
		JOptionPane.showMessageDialog(null, "Total Price is "+totalPrice+"baht."+"\nAdd Vat 7%  is "+frm.format(vat)+" baht.");
		
		
	}

}
