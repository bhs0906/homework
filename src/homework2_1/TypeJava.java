package homework2_1;

public class TypeJava {

	public static void main(String[] args) {
		//java의 자료형을 선언하고 출력
		
		byte byteType = 100; 					//8 비트 정수 
		short shorType = 200;					//16비트 정수 
		int intType = 1000000;					//32비트 정수 
		long longType = 1000000000L;			//64비트 정수	
		float floatType = 3.14246484513f;		//32비트 부동소수점 
		double doubleType = 3.14246484513;	//64비트 부동소수점 
		char charType = '가';					//16비트 유니코드  
		boolean booleanType = true;			// true , false 
		
		System.out.println("java의 자료형을 선언하고 출력");
		System.out.println();
		System.out.println("byteType : "+ byteType);
		System.out.println("shorType : "+ shorType);
		System.out.println("intType : " +intType);
		System.out.println("longType : "+longType);
		System.out.println("floatType : "+floatType);
		System.out.println("doubleType : "+doubleType);
		System.out.println("charType : " +charType);
		System.out.println("blooleanType : "+ booleanType);
		
	}

}
