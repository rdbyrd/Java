import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		// create scanner object
		Scanner input = new Scanner(System.in);

//		create variables for multiple datatypes
		String text = input.nextLine();
//		int wholeNum = input.nextInt();
//		double doubleNum = input.nextDouble();
//		boolean bool = input.hasNext();
//		float floatingNum = input.nextFloat();

		// output typed data
		System.out.println("You entered " + text + ", which is a string.");

	}
}
