package homework2_7;

//2. 완전한 수 : 자신을 제외한 약수의 합이 자신과 같은 수

public class TEST02 {

  public static void main(String[] args) {
      int i, j, sum;
		
      for(i=1; i<=500; i++) {
          sum=0;
          for(j=1; j<i; j++)
              if(i%j==0)
                  sum+=j;
          if(sum==i) {
              System.out.println("완전수 : " + i);
				
          }
      }
  }
}
