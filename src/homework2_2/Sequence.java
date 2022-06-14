package homework2_2;

//2. 등비수열 , 등차 수열 사용하여 아래와 같이 출력
//		1: 1 2 4 8 16
//		2: 250 200 150 100 50

public class Sequence {

    public static void main(String[] args) {
	for(int i=1;i<=2;i++) {
	    System.out.print(i+" : ");
	    if(i==1) {
		for(int j=0;j<5;j++) { 
		    System.out.print(1*(int)Math.pow(2,j)+" ");
		}
	    }
	    else {
		for(int j=0;j<5;j++)
		    System.out.print(250-(50*j)+" ");
		}
			
	    System.out.println();
	}
    }
}