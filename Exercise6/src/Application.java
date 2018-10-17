import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		//create a new Scanner object and pass it an input string object
		Scanner input = new Scanner(System.in);
		
		//system feature prompting the user to type in a line of text
		System.out.println("Enter a line of text: ");
		
		//wait for user to input a line of text
		String line = input.nextLine();
		
		//output what text was entered
		System.out.println("You entered: " + line);
	}
}
