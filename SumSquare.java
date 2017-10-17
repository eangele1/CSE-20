import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt(), total = 0;
		
		for (int i = 1; i <= max; i++) {
			
			total += i * i;
			
			System.out.println("Number " + i + " squared is " + (i * i));
		}
		
		System.out.println("Sum of Squares is " + total + ".");
		
		input.close();
	}
}