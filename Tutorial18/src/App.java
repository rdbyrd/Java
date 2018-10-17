//constructor methods
class Machine {

	private String name;
	private int code;

	// create a constructor method
	/*
	 * notice that constructors have two parts: 1) datatype is not declared since it
	 * has no return value, though it is a method 2) invoked by typing in the number
	 * of arguments fit by parameter below
	 */
	public Machine() {
		//call the larger constructor within the smaller constructor
		this("test", 9);
		System.out.println("Constructor running");

		// you can use a constructor to set a default value for a variable
		name = "Test";

	}

	// create a constructor method with two parameters
	public Machine(String name, int code) {
		
		//call the simpler constructor with no parameters
		
		System.out.println("Second constructor testing successful.");
		this.name = name;
		this.code = code;

	}

}

public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine();

		Machine machine2 = new Machine("Testboy", 2);
	}

}
