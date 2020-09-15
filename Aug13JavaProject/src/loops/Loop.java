package loops;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			System.out.println("Samrat");
		
		}
		
		//type name = new type[5]
		String name[] = new String[5];
				
		//Array...[] called subscript
		name[0]="Samrat";
		name[1]="John";
		name[2]="Mike";
		name[3]="Ron";
		name[4]="Harry";
				
		
		for(int i=1; i<5; i++) {
			System.out.println(name[i]);
		}
		
		int i=0;
		
		while (i<5) {
			System.out.println(name[i]);
			
			i=i+1; //or i++;
		}
		
		i = 0;
		
		do {
			System.out.println(name[i]);
			i++;	
		} while(i<5);

	}

}
