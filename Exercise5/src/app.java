import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		// Write a program that takes two numbers as input 
		// and displays the product.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number1 = input.nextInt();
		
		System.out.println("Input another number: ");
		int number2 = input.nextInt();
		
		int product = number1*number2;
		
		System.out.println(number1 + " x " + number2 + " = " + product);
		
	}
}
