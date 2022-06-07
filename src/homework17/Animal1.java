package homework17;

//---동물클래스(ver2)---//
abstract class Animal1 {
	private String name;			//이름

	public Animal1(String name) {	//생성자
		this.name = name;
	}
	
	public abstract void bark();	//짖기

	public String getName() {		//이름확인
		return name;
	}
	
	public abstract String toString(); //문자열 표현 반환
	
	public void introduce() {
		System.out.print(toString()+"이다.");
		bark();
	}
}