package homework17;

public class ExCar2{

public ExCar2(String name, int width, int height, int length, double fuel, 
		Day purchaseDay) {
	super();
	this.name = name;	this.width = width;	this.height = height;
	this.length = length; this.fuel = fuel; x = y =0.0;
	this.purchaseDay = new Day(purchaseDay); totalMileage = 0.0;
	}
}