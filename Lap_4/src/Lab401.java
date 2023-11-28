import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y,sum,total;
		System.out.print("Input value of X : ");
		x = scan.nextInt();
		System.out.print("Input value of Y : ");
		y = scan.nextInt();
		while(true) {	
		if (y<x) {
			System.out.print("Input value of Y, again : ");
			y = scan.nextInt();
			break;
		}
		}
		sum = x;
		System.out.println();
		
		while(x<y)
		{
			x++;
			total = sum + x;
			System.out.println(sum+"+"+x+"="+total);
			sum = total;
		}
		
		
	}

}
