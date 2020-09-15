package encapsulation;

public class CitiBank {

	public static void main(String[] args) {
		
		CBank c1 = new CBank();
		System.out.println(c1.getInterestRate());
		
		c1.setInterestRate(22);
		System.out.println(c1.getInterestRate());

	}
}
