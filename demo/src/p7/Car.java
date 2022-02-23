package p7;

public class Car {

	// Default Constructor
	public Car() {
		h = 5;
		w = 7;
	}

	// Parameterized constructor
	public Car(int x, int y) {
		h = x;
		w = y;
	}

	int h;
	int w;

	void display() {
		System.out.println(h + " and " + w);
	}

}