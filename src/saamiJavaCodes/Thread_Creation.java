package saamiJavaCodes;
import java.awt.*;
//Thread creation through implementing Runnable interface.
 class Thread_1 implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("thread1 : "+i);
		}
	}
}
 class Thread_2 implements Runnable{
	 public void run() {
		 for(int j=0;j<5;j++) {
		 System.out.println("Thread 2 : "+j);
	 }
	 }
 }
 public class Thread_Creation{
	 public static void main(String args[]) {
		 Thread_1 t1= new Thread_1();
		 Thread_2 t2=new Thread_2();
		 Thread tobj1=new Thread(t1);
		 Thread tobj2=new Thread(t2);
		 tobj1.start();
		 tobj2.start();
		 tobj1.setPriority(5);
		 
		 
	 }
 }

