package saamiJavaCodes;
import java.util.Scanner;

public class Factorial_Using_For {
	public static void main(String args[]) {
		System.out.println("Enter the number you want to calculate the factorial of : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=2;i--) {
			
		fact=fact*i;
	}
		System.out.print(fact);		
}
}
