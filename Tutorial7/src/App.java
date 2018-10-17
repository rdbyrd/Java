import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		//create scanner object 
		Scanner input = new Scanner(System.in);
		
		//output prompt
		System.out.println("Enter a decimal: ");
		
		//wait for user to enter a line of text 
		double value = input.nextDouble();
		
		//tell them what they entered
		System.out.println("You entered: " + value);
		
	}
}
