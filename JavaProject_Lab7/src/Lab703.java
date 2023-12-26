import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = {78,36,58,41,25,92,75};
		System.out.print("Input index of array : ");
		int inputnum = scan.nextInt();
		while(inputnum<0||inputnum>=num.length) {
			System.out.print("Input index of array, again : ");
			inputnum = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is "+num[inputnum]);
			if(inputnum==(num.length-1)) {
				System.out.println("Sorry, "+inputnum+" is the last index in array.");
			}
			else {
				System.out.println("Value in next    index is "+num[inputnum+1]);
			}
		
		
		
	}

}
