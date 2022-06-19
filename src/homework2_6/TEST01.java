package homework2_6;

//1. 주사위 던지기

public class TEST01 {

	public static void printAddDie() {
	for(int i=1; i<=6; i++) {
		for(int j = 1; j<=6; j++) {
			System.out.println(j+ "+" +i+ "=" +(i+j)+ "\t");
		}
		System.out.println();
	}
	System.out.println("---------------------");
}
	
	public static void printMultiDie() {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				System.out.println(i+ "*" +j+ "=" +(i*j)+ "\t");
			
		}
		System.out.println();
	}
	System.out.println("----------------------");
	
		}

	

public static void main(String[] args) {
	
	TEST01.printAddDie();
	TEST01.printMultiDie();
	
	TEST01 die = new TEST01();
	die.printAddDie();
	die.printMultiDie();
}
}


