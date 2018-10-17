import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		
	//create a new Scanner object
	Scanner input = new Scanner(System.in);
	
	//prompt user to type something in 
	System.out.println("Enter a double: ");
	
//	declare the double variable
	double Number = input.nextDouble();
	
	//output what was typed
	System.out.println("You entered: " + Number);
	
	}
}
