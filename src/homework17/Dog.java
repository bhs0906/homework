package homework17;

//--- 개 클래스 (Ver.1) ---//
class Dog extends Animal {
	private String type;	// 개의 종류
	public Dog(String name, String type) {		      // 생성자
		super(name); this.type = type;
	}
	public void bark() {System.out.println("멍멍!");}         // 짖기
}
