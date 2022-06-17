package homework2_4;

import java.util.Scanner;

//3. 중첩 for문  - 추가된 이미지 참조

public class TEST03 {
	
//	static void Star(int s) {
//		for(int i=0; i<s; i++) {
//			System.out.println("*");
//		}
//		System.out.println();
//	}

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("높이값 : "); int x = scan.nextInt();
//		
//		System.out.println("Ver_1");
//		for(int i=0; i<x; i++) {
//			Star(i+1);
//		}
//		System.out.println();
//		System.out.println("---------------------------");
//		System.out.println("Ver_2");
//		
//		for(int i=x; i>=0; i--) {
//			Star(i);
//		}
		
	    int z = 10;
	    for(int i=1; i<=z; i++){
	    	System.out.printf("j = ");
	      for(int j=0; j<i; j++) System.out.print(j);
	      System.out.println();
	    }
	     System.out.println();
	    for (int i = 10; i >= 0; i--) { System.out.printf("j = ");
	    	for (int k = 0; k<= i; k++) System.out.print(k);
	    	System.out.println();
	    }
	}
}
