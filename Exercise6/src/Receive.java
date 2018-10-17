import java.util.Scanner;

public class Receive {

	public static void main(String[] args) {
		
		//create a new Scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt the user to type a message
		System.out.println("Write something here.");
		
		//create a variable for holding user input as a string
		String text = input.nextLine();
		
		//output what the user typed
		System.out.println("You typed: " + text);
	}
}
