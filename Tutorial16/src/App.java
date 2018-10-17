//pass parameters to methods
class Robot {
	
	//design the parameter to receive text from the Robot object later
	public void speak(String text) {
		
		//output what was passed in as an argument through a robot object
		System.out.println(text);
	}
	
	//create a new method that calculates jump height
	public void jump(int height) {
		System.out.println(height);
	}
	
	//create a new method that has two parameters
	public void direction(int direction, String text) {
		System.out.println("Moving " + direction + " meters " + text);
	}
}

public class App {
	public static void main (String[] args) {
		//create a Robot object
		Robot robot1 = new Robot();
		
		//call the speak method
		robot1.speak("Hi, this is a test.");
		robot1.jump(15);
		
		//create a command that will make the Robot object go 25 meters northwest
		robot1.direction(25, "northwest.");
		
		//make the robot say a greeting by assigning a text to a variable, then inserting the variable into the argument
		String greeting = "Hello there";
		robot1.speak(greeting);
		
		//make the robot jump a certain height by initializing a variable for it, then passing that variable into the method
		int jumpAgain = 15;
		robot1.jump(jumpAgain);
	}

}
