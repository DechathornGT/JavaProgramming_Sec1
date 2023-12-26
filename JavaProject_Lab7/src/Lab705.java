import javax.swing.*;
public class Lab705 {
	static String even="",odd="";
	public static void main(String[] args) {
		int[] num = new int[5];
		for(int i=0;i<num.length;i++) {
		num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" : "));
		}
		showEven(num);
		showOdd(num);
	}//end
	
	public static void showEven(int[] number) {
		for(int _number:number) {
			if(_number%2==0) {
				even += _number+" ";
			}
			
		}
		JOptionPane.showMessageDialog(null,"List of even number: \n"+even);
	}//end
	public static void showOdd(int[] number) {
		for(int _number:number) {
			if(_number%2==1) {
				odd += _number+" ";	
			}
			
		}
		JOptionPane.showMessageDialog(null,"List of odd number: \n"+odd);
	}//end
}
