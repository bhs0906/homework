package homework11;

//배열이 가지는 모든 요소의 합 구하기(기본 for문)
import java.util.Scanner;
	
class Sum0f1_03 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("24+:");
		int num = stdIn.nextInt();
		int[] x = new int[num]; 
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		System.out.println("2E 29"+ sumOf(x) + ".");
		}
 }
