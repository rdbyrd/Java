import java.util.Scanner;

public class Do {

	public static void main(String[] args) {
		
		
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//initialize a variable; set its default value; pass variable into do, while loop
		int number = 0;
		do {
			//output a prompt to make the user type in a number
			System.out.println("Enter a number: ");
			number = input.nextInt();
		} while (number != 5);
			
			//when the number is finally hit, output response
			System.out.println("Got 5!");
		
	}
}
