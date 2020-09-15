package controlstatements;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  age=15;
		
		if (age<18) {
			System.out.println("You can't vote");
		} else if (age<21) {
			System.out.println("You can vote but not drink");
		} else {
			System.out.println("You can do all");
		}

	}

}
