package homework17;

public class AnimalTester1_1 {
	public static void main(String[] args) {
		Animal1[] a= new Animal1[2];
		a[0] = new Dog2("뭉치", "치와와"); 	// 개
		a[1] = new Cat2("마이콜",7);		// 고양이
		
		for (int  i= 0;  i< a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		
		for (int  i= 0;  i< a.length; i++) {
			System.out.print("a["+i+"]=");
			a[i].introduce();
		}
	}
}