package hello;

import java.util.Scanner;

public class Simple {
	
	public abstract class Animal{
		public abstract void animalSound();    // Abstract method (does not have a body)
		public void sleep() {
			System.out.println("Zzz");         // Regular method
		}
	}
	class Dog extends Animal{                  //whoever inherits from animal must implement abstract method
		@Override
		public void animalSound() {           // The body of animalSound() is provided here
			System.out.println("animal sound: haw haw");
		}
	}
	class Cat extends Animal{                 //whoever inherits from animal must implement abstract method
		@Override
		public void animalSound() {           // The body of animalSound() is provided here
			System.out.println("animal sound: miyaooo");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner myObj=new Scanner(System.in);
		String userName;
		System.out.println("Enter user name");
		userName=myObj.nextLine();
		System.out.println("Hello user: "+userName);
		String animal;
		Simple s= new Simple();
		System.out.println("choose dog or cat");
		animal= myObj.nextLine();
		if(animal.equalsIgnoreCase("dog")) {
			Simple.Dog myDog= s.new Dog();
			myDog.animalSound();
			myDog.sleep();
		}else if(animal.equalsIgnoreCase("cat")) {
			Simple.Cat myCat= s.new Cat();
			myCat.animalSound();
			myCat.sleep();
		}else {
			System.out.println("typing error");
			System.out.println(animal);
		}

	}

}
