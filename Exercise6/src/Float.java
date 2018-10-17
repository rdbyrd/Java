import java.util.Scanner;

public class Float {
	public static void main(String[] args) {
		
		//create a new Scanner object for receiving input
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a floating point number: ");
		
		//declare floating point number variable
		float floatingNum = input.nextFloat();
		
		//make the next line output what was typed
		System.out.println("You entered: " + floatingNum);
		
	}
}
