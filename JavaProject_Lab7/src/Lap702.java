import java.util.*;
public class Lap702 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] score = new double[5];
		double sum=0,average=0;
		for(int i=0;i<score.length;i++) {
			System.out.print("Input score of student "+ (i+1)+" : ");
			score[i] = scan.nextDouble();
			sum = sum +score[i];
			}
		System.out.println();
		average = sum/score.length;
		System.out.println("Average of "+ score.length +" student is "+average);
		int j = 1;
		for(double _score:score) {
		if(_score>average) {
		System.out.println("> Student "+ j +" ("+_score+")");
			}
		j++;
		}
	}
}
