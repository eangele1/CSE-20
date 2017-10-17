import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i = 0;
		int total = 0;
		while (max < 0){
			System.out.println("Please enter positive numbers.");
			max = input.nextInt();
		}
		while (i <= max) {
			total += i;
			System.out.println("Number " + i);
			i++;
		}
		System.out.println("Sum of all is " + total + ".");
		input.close();
	}
}