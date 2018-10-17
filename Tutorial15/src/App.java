//getters and return values 
class Person {

	// initialize attributes
	String name;
	int age;

//	method for Person class
	void speak() {
		System.out.println("My name is " + name);
	}

	// create another method that performs a calculation
	int retirement() {

		// initialize a variable to perform a calculation
		int yearsToRetirement = 60 - age;

		// output the result on a line from a return statement
		return yearsToRetirement;
	}

	// establish getter methods
	// these encapsulate and return values for the variables age and name
	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}
}

//main class for this file
public class App {

	// main method
	public static void main(String[] args) {

		// create a new person object
		Person person1 = new Person();

		// give person attributes
		person1.name = "Joe";
		person1.age = 45;

		// call person one's command to speak
//		person1.speak();

		// create a variable that will be assigned equal to the return value of the
		// retirement method
		int years = person1.retirement();

		// output the value of the years variable
		System.out.println(years + " year(s) until retirement.");

		//use the get methods to store the name and age attributes declared above
		String name = person1.getName();
		int age = person1.getAge();

		//pass the get methods above into a new line to output variable data
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
