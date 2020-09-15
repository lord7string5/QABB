package inheritence;

public class Parrot {
	
	String color="green";
	

	public static void main(String[] args) {
		
		Parrot suga = new Parrot();
		suga.mimic();
		
		System.out.println(suga.Sing());

	}
	
	public void mimic() {
		System.out.println("Gopi Krishna Ko!");
	}
	
	public String Sing() {
		return "La la la la";
	}

}
