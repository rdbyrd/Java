import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		//create a Scanner object, then set it to receive system input
		Scanner input = new Scanner(System.in);
		
		//prompt user to type in text
		System.out.println("Enter a number: ");
		
//		Create a variable that receives input
		int integer = input.nextInt();
		
		System.out.println("You entered: " + integer);
	}
}
