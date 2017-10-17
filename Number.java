import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		
		num = input.nextInt();
		
		if (num > 25 || num < 0)
			System.out.println("Outside of acceptable range.");
		else {
			System.out.println("You have entered " + num + ".");
		
			System.out.println(num + " character of the alphabet is " + (char) (num + 65) + ".");
		}
		input.close();
	}
}