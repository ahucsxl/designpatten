package factory;

public class simpleFactory2 {
	public static void main(String[] args) {
		Car c = Factory.getInstance("Bmw");
		c.drive();

	}
}
interface Car {
	public void drive();
}

class Benz implements Car {

	public void drive() {
		System.out.println("Benz");
	}
}

class Bmw implements Car {
	@Override
	public void drive() {
		System.out.println("drive Bmw");

	}

}

class Factory {
	public static Car getInstance(String s) {
		switch (s) {
		case "Benze":
			return new Benz();
		case "Bmw":
			return new Bmw();
		default:
			return null;
		}
	}
}