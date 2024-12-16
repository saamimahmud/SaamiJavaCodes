package saamiJavaCodes;

import java.util.Scanner;

public class Prime_Numbers {
	public static void main(String args[]) {
		int count=0;
		System.out.println("Enter number .");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count=count+1;
			} 
			}
		if (count>=2) {
			System.out.println("Number is not prime");
		}else if(count<=1) {
			System.out.println("Number is  prime");
			
		}
	}
		
	}


