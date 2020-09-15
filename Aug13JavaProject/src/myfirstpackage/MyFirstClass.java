package myfirstpackage;

public class MyFirstClass {
	
	public static void main(String args[]) {
		
		//This prints name
		/*Hello
		 * this is 
		 * multi 
		 * line 
		 * comment
		 */
		System.out.println("Samrat");
		int a = 1;
		int b = 2;
		
		var addition = add(a, b);
		
		System.out.print(addition);
		
	}

	private static int add(int a, int b) {
		var add = a + b;
		return add;
	}

}
