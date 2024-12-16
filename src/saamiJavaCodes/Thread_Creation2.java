package saamiJavaCodes;
import java.awt.*;
//Creation of Thread through extending Thread class;
class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread1 : "+i);
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		for(int j=0;j<5;j++) {
			System.out.println("Thread2 : "+j);
		}
	}
}

public class Thread_Creation2 {
	public static void main(String args[]) {
		Thread_1 t1=new Thread_1();
		Thread_2 t2=new Thread_2();
		//t1.setPriority(5);
	}

}
