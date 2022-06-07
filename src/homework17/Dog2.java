package homework17;

//--- 개 클래스 (ver.2) 

class Dog2 extends Animal1{
	private String type;
	public Dog2(String name,String type) {
		super(name);
		this.type = type;
	}
	public void bark() {
		System.out.println("멍멍");
	}
	
	@Override
	public String toString() {
		return type+"의"+getName();
	}
	
}