package homework15;

public class ExId {
static int counter = 0;
private static int step=1;
private int id;

public ExId() {
	id = counter += step;
}


public int getId() {
	return id;
}



public static int getStep() {
	return step;
}

public static int setStep(int s) {
	return step;
}

public static int getMaxId() {
	return counter;
}

}

