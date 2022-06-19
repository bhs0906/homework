package homework2_6;

//1~20사이에서 2 또는 3의 배수 출력

public class TEST03 {

    public static void main(String[] args) {
	for(int i=1;i<20;i++) {
	    if(i%2==0 || i%3==0) System.out.println(i);
	}
    }
}