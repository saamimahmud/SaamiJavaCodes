package saamiJavaCodes;
class Animal{
	void eat() {
		System.out.println("eats food");
	}
	void makesSound() {
		System.out.println("Makes a sound !");
	}
}
class Dog extends Animal {
	void hasLegs() {
		System.out.println("Has 4 legs !");
	}
	void hasTail() {
		System.out.println("Yes");
	}
	@Override
	void makesSound() {
		System.out.println("Makes Barking Sound !!");
	}
}
class Cat extends Dog{
	@Override
	void makesSound() {
		System.out.println("Makes Meowing Sound");
	}
}

public class Inheritance_Code {
	public static void main(String args[]) {
		Cat cat= new Cat();
		cat.hasTail();
		cat.makesSound();
		cat.eat();
		
	}
	
}
