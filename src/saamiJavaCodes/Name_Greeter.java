package saamiJavaCodes;
import java.util.Scanner;
//QUESTION: write a code that takes users name and greets them.
public class Name_Greeter {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Name : ");
	String name =sc.nextLine();
	System.out.println("hey '"+name+"', have a good day.");
}
}
