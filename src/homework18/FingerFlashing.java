package homework18;

import java.util.Scanner;

//가위바위보 테스트 프로그램
public class FingerFlashing {

  public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
      HumanPlayer hp = new HumanPlayer();
      ComputerPlayer cp = new ComputerPlayer();
      String[] hands = {"가위","바위","보"};
		
      int retry;
      do {
          //컴퓨터 손을 생성
          int comp = cp.nextHand();
			
          //사람 손을 생성
          int user = hp.nextHand();
			
          //양쪽의 손을 표시
          System.out.println("나는"+hands[comp]+ "이고, 당신은"
                                                       + hands[user]+ "입니다");
			
          //판정
          int judge = (user - comp +3)%3;
          switch(judge) {
          case 0: System.out.println("비겼습니다."); break;
          case 1: System.out.println("당신이 졌습니다.."); break;
          case 2: System.out.println("당신이 이겼습니다."); break;
          }

          //다시 한번 할지 확인
          do {
              System.out.print("다시 한번?(0)아니오 (1)네:");
              retry = stdIn.nextInt();
          }while(retry !=0 && retry !=1);
      }while(retry ==1);
  }
}