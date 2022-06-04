package homework15;

public class Id2 {

	private static int counter = 0;
	private int id;
	
	public Id2() {
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
	
	private static int getMaxId() {
		return counter;
	}
	
}