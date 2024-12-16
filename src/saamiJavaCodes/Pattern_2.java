package saamiJavaCodes;
import java.util.Scanner;
/* Print the following pattern using a function:
 *
 * *
 * * *
 * * * *
   */
 
public class Pattern_2 {
	 public static void Pattern(int n) {
		 for (int i=0;i<n;i++) {
			 for(int j=0;j<=i;j++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	 }
	 public static void main(String args[]) {
		 System.out.println("Enter the number o lines you want to print: ");
		 Scanner sc=new Scanner(System.in);
		 int input=sc.nextInt();
		 Pattern(input);
	 }
	 
}
