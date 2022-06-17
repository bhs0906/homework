package homework2_4;

//2.  문자를 유니코드 변환 프로그램 작성

import java.util.Scanner;

public class TEST02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String str = scan.next();
		for(int i=0; i<str.length(); i++) {
			System.out.format("0x%04x ",(int)str.charAt(i));
		}

	}

}
