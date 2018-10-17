/*
 * Understanding static (aka class) variables
 * a static variable is a permanent fixture for all objects within a class
 * non-static variables have attributes assigned to them (e.g. name) when an object is declared
 * static variables have the same value assigned to all objects; the are unchanging 
 */

class Thing {
	public String name;

	//create a static variable for a lucky number
	//note: final ensures the value cannot be changed, while static makes sure it's fixed in a class
	//no extra values may be added
	public final static int LUCKY_NUMBER = 7;

	//declare a static variable count above
	public static int count = 0;
	public int id;
	
	public Thing() {
		
		id = count;
		//increment the count variable for every object that exists
		//count's invocation in a constructor allows it to be shared across all objects
		count++;
	}
	
	// when making a variable static, place the 'static' keyword before the datatype
	public static String description;

	// create a method that calls the name so that it does not need to be declared
	// via sysout, but called as an object's method
	public void showName() {
		System.out.println("Object id: " + id + ", " + description + ": " + name);
	}

	public static void info() {
		System.out.println(description);
	}
}

public class App {

	public static void main(String[] args) {
		// declare the value for the static variable
		Thing.description = "I am a description";

		// call up the static method
		Thing.info();

		// output the static variable
		System.out.println(Thing.description);
		System.out.println("Before creating objects, count is " + Thing.count);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		System.out.println("Before creating objects, count is " + Thing.count);
		thing1.name = "Bob";
		thing2.name = "notBob";

		thing1.showName();
		thing2.showName();

		// Math is a class built into Java and PI is a constant. PI is static in Math so
		// that all future invocations of this feature is always the same
		System.out.println(Math.PI);
		
		//output the lucky number attribute from the Thing class
		System.out.println(Thing.LUCKY_NUMBER);

	}

}
