package saamiJavaCodes;
import java.util.Scanner;
public class GivenNum_GreaterThan_UserNum {
	public static void main(String args[]) {
		//QUESTION: Find whether the given number is greater than the users input number.
	Scanner sc=new Scanner(System.in);
	int given_num=10;
	System.out.println("Enter a number : ");
	int user_num=sc.nextInt();
	boolean compare=user_num>given_num;
	System.out.println("Is the User's number greater than the given number : "+compare );
	
	}
}
