import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt(), total = 0;
		
		for (int i = 0; i <= max; i++) {
			
			total += i;
			
			System.out.println("Number " + i);
		}
		
		System.out.println("Sum of Numbers is " + total + ".");
		
		input.close();
	}
}