package interfacepkg;

public class Cat implements Animal {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Cat Walks");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Cat Runs");
		
	}
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		//another way
		//Animal cat = new Cat();
		cat.walk();
		cat.run();

	}

}
