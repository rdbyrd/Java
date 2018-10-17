import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
	//create a Scanner object
	Scanner input = new Scanner(System.in);
	
	//prompt the user to type in something
	System.out.println("Enter an integer: ");
	
	//initialize a variable so that user can import data
	int number = input.nextInt();
	
	//create a while loop that will respond only if the user types in 5
	while (number != 5) {
		System.out.println("Enter an integer: ");
		number = input.nextInt();
	}
	
	System.out.println("Got 5!");
	
	}
}