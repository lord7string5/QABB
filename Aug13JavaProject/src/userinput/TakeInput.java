package userinput;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		input.close();
		
		System.out.println("***********************");
		System.out.println("Your Details Are " + name + age);
	}

}
