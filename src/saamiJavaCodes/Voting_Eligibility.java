package saamiJavaCodes;
import java.util.Scanner;
public class Voting_Eligibility{
	public static void main(String args[]) {
	
	System.out.println("Enter your age:");
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	int t=18-age;
	if(age>=18) {
		System.out.println("You are eligible to vote.");
		
	}else {
		System.out.printf("You cannot vote. Please try again after %d years",t);
	}
	
	}
	
}