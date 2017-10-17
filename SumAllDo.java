import java.util.Scanner;

public class SumAllDo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i = 0, total = 0;
		do {
			total += i;
			System.out.println("Number " + i);
			i++;
		} while ( i <= max);
		
		System.out.println("Sum of Numbers is " + total + ".");
		
		input.close();
	}
}