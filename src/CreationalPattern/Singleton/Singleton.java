package CreationalPattern.Singleton;

public class Singleton {
	private static Singleton uniqueInstance;
	
	static int count = 0;

	// private constructor
	private Singleton() {
		count++;
	}

	// factory method
	public static Singleton getInstance() {

		// lazy instantiation
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}

		return uniqueInstance;
	}
}
