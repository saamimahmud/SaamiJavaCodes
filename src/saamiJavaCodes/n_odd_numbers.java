package saamiJavaCodes;
import java.util.Scanner;
public class n_odd_numbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till you want to print odd numbers starting from 1.");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.println(2*i+1);
		}
	}

}
