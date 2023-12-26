import java.util.*;
public class Lab_Example703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5]; 
		for(int i=0; i<number.length;i++) {
			System.out.print("Input number "+ (i+1)+":");
			number[i] = scan.nextInt();
		}
		int totalNumber = sumOfPos(number);
		System.out.print("Summation of positive number is "+totalNumber);
		
	}//end main
	public static int sumOfPos(int[] nums) {
		int sum = 0;
		for (int _num:nums) {
		if(_num>0) {
			sum += _num;
			}
		}
		return sum;
		
	}//end

}
