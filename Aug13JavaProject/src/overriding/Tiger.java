package overriding;

public class Tiger extends Animal{
	
	@Override
	public void Sound() {
		System.out.println("Tiger Roars");	
	}
	
	public void Pounce() {
		System.out.println("Tiger Pounces");
	}
	
	public static void main (String[] args) {
		Tiger tiger = new Tiger();
		tiger.Sound();
		tiger.Pounce();
	}
	
	
	

}
