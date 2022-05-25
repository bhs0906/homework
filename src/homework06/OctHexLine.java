package homework06;

import java.util.Scanner;
// 10진수를 읽어서 8진수, 16진수로 표시 (방법2)
public class OctHexLine {
        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);
		
            System.out.println("정수:");
            int x = stdIn.nextInt();
		
             System.out.printf("8진수는 %o이고 16진수는 %x입니다.\n", x, x);
       }

}
