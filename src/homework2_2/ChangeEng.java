package homework2_2;

import java.util.Scanner;

//3. 영문자를 입력하면 소문자는 대문자 대문자는 소문자로 출력

public class ChangeEng {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("문자열을 입력하세요 : ");
	String str = sc.next();
		
	char[] arr = str.toCharArray();
		
	for(int i=0;i<arr.length;i++) {
	    if(arr[i]>='A' && arr[i]<='Z')
	        System.out.print((char)(arr[i]+32));
			
	    else
		System.out.print((char)(arr[i]-32));
	}
    }
}