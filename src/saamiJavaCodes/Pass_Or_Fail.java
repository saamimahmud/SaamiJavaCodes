package saamiJavaCodes;
import java.util.Scanner;
public class Pass_Or_Fail {
	public static void main(String args[]) {
		 int maths,eng,science;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter marks for Maths: ");
		 maths=sc.nextInt();
		 System.out.println("Enter marks for english: ");
		 eng=sc.nextInt();
		 System.out.println("Enter marks for science: ");
		 science=sc.nextInt();
		 int total_marks=maths+science+eng;
		 float total_percent=(total_marks/300.0f)*100;
		 if(total_percent>=40 && maths>=33 && eng>=33 && science>=33)
		 {
			 System.out.println("You have passed this semester.");
			 System.out.println("Your percentage = "+total_percent+"%");
		 }
		 //else {
			 //System.out.println("You have failed.");
		 //}
	
	}

}
