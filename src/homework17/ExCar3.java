package homework17;

public class ExCar3 extends Car {
	@Override public void putSpec() {
	super.putSpec();
	System.out.println("총 주행 거리: %.2fkm\n", totalMileage);
	}
}
