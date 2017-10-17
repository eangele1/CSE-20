import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mult;

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		
		System.out.println("Enter the Base:");
		
		int i = input.nextInt();
		
		for (mult = i; mult <= max; mult += i) {
			System.out.println("Number is " + mult);
		}
		input.close();
	}
}