package homework2_2;

import java.util.Scanner;

//1. int year=2004 처럼 년도를 설정하면 홀수/짝수해 인지를 구분하고 윤년까지 출력 구별해서 출력

public class Year {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	System.out.print("년도를 입력하세요 : ");
	int year = sc.nextInt();
	if(year%2==0) System.out.println("짝수해입니다.");
	else System.out.println("홀수해입니다.");
		
	if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0)
	    System.out.println("윤년입니다.");
	else
	    System.out.println("윤년이 아닙니다.");
    }
}