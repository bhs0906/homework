package homework2_4;

import java.util.Arrays;
import java.util.Scanner;

//1. 10개의 값 중 최대값, 최소값, 중간값을 구해서 출력

public class TEST01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int[] x = new int[10];
		
		int sum=0;

		
		for(int i=1; i<=10; i++) {
			System.out.println(i+"번째 : ");
			x[i-1] = sc.nextInt();
			sum += x[i-1];
		}
	
		double avg = (double)sum/10.0;
		Arrays.sort(x);						//배열 x를 오름차순으로 정렬
		
		System.out.println("최소값 : " + x[0]);
		System.out.println("중간값 : " + (((avg-x[4]) > (x[5]-avg)) ? x[5] : x[4]));
		System.out.println("최대값 : " + x[9]);
	}
}