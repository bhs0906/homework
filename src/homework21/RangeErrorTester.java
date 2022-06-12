package homework20;

import java.util.Scanner;

public class RangeErrorTester {
	/*--- n은 1의 자리(0~9)인가? ---*/
	static boolean isValid(int n) {
	return n >=0 && n <= 9;
	}
	/*--- 1자리(0~9) 정수 a와 b의 합 구하기 ---*/
	
	static int add(int a, int b) throws ParameterRangeError, ResultRangeError{
		if (!isValid(a)) throw new ParameterRangeError(a);
		if (!isValid(b)) throw new ParameterRangeError(b);
		int result = a + b;
		if (!isValid(result)) throw new ParameterRangeError(result);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
				
		System.out.print("정수 a: "); int a = stdIn.nextInt();
		System.out.print("정수 b: "); int b = stdIn.nextInt();
		
		try {
		System.out.println("합은 " + add(a, b) + "입니다." );
		} catch (RangeError e) {
			System.out.println("범위 밖 예외가 발생했습니다.\n" + e.getMessage());
		}
	}
}
