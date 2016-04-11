package singleton;
/**
 * 
 * @author ahucsxl
 *
 */
public class singleton1 {

	public static void main(String[] args) {
		
		Singleton instance = Singleton.getInstance();

	}

}

class Singleton {

	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
           return instance;
	}

}