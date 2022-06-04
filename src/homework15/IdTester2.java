package homework15;

public class IdTester2 {

	public static void main(String[] args) {
	Id a = new Id();
	Id b = new Id();
	
	System.out.println("a의 식별 범호:" + a.getId());
	System.out.println("b의 식별 범호:" + b.getId());
	
	
	
	System.out.println("마지막으로 부여한 식별 번호 =" + Id.counter);
	System.out.println("마지막으로 부여한 식별 번호 =" + a.counter);
	System.out.println("마지막으로 부여한 식별 번호 =" + b.counter);
	
	
	

	}

}
