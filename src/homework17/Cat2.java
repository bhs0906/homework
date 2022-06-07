package homework17;

//--- 고양이 클래스 (ver.2) 
public class Cat2 extends Animal1 {
	private int age;
	public Cat2(String name, int age) {
		super(name);
		this.age = age;
	}
	
	public void bark() {
		System.out.println("냐옹!");
	}

	@Override
	public String toString() {
		return age+"의"+getName();
	}
}