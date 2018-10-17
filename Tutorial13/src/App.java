
//note: only one public class permitted in a .java page
class Person {

	// classes do two things:
	// 1. Store data
	// 2. Make methods (or functions) a created object will do

	// establish private attributes for the Person class
	String name;
	int age;

}

//create person object
public class App {

	// establish main method for the program to run
	public static void main(String[] args) {
		
		//call up person class like String class is called up, then give it identity, declaring as a normal variable
		Person person1 = new Person();
		
		//assign properties to Person1
		//call up the variable, then with a . call up the property to assign
		person1.name = "John";
		person1.age = 29;
		
		//create another person object
		Person person2 = new Person();
		
		//give properties to the person
		person2.name = "Sarah";
		person2.age = 24;
		
		//call up the name property from person1
		System.out.println(person1.name);
		
	}

}
