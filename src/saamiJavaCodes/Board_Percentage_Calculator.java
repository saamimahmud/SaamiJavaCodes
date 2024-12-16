package saamiJavaCodes;
import java.util.Scanner;
//Question: Write a program to calculate percentage of a given student
//in CBSE board exam. His marks from 5 subjects must be taken as input.
public class Board_Percentage_Calculator {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the name of the student:");
	String name_student=sc.nextLine();
	
	System.out.println("Enter the marks of English");
	float eng=sc.nextFloat();
	System.out.println("Enter the marks of Hindi");
	float hindi=sc.nextFloat();
	System.out.println("Enter the marks of Maths");
	float maths=sc.nextFloat();
	System.out.println("Enter the marks of Science");
	float science= sc.nextFloat();
	System.out.println("Enter the marks of Physical Health Education ");
	float phe=sc.nextFloat();
	float sum=eng+maths+hindi+science+phe;
	
	float percent=(sum/500)*100;
	System.out.println("The percentage of the student '"+name_student+"' = "+percent);
	
	
}
}
