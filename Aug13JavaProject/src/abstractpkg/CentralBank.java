package abstractpkg;

 public abstract class CentralBank {
	
	public void deposit() {
		
		System.out.println("User should deposit the amount");
	}
	
	public void withdraw() {
		System.out.println("Customer can withdraw the amount");
	}
	
	public abstract void interestrate();
	
	

}
