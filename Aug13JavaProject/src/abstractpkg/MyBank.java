package abstractpkg;

public class MyBank extends CentralBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyBank myBank = new MyBank();
		myBank.deposit();
		myBank.interestrate();
		myBank.withdraw();

	}

	@Override
	public void interestrate() {
		System.out.println("10%");
		
	}

}
