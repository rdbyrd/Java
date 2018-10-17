import java.util.Scanner;

public class app {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number1 = input.nextInt();
		
		System.out.println("Enter another number: ");
		int number2 = input.nextInt();
		
		int add = number1 + number2;
		int sub = number1 - number2;
		int mult = number1 * number2;
		int divide = number1 / number2;
		int modulus = number1 % number2;
		
		System.out.println("Add: " + add + "\n" + "Subtract: " + sub + "\n" + "Multiply: " + 
		mult + "\n" + "Divide: " + divide + "\n" + "Modulus: " + modulus);
		
		
	}
}
