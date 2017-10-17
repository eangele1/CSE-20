import java.util.Scanner;

public class AnyAverageArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will find the average of any numbers.");

		System.out.print("Please choose amount of numbers to average:");
		int max = input.nextInt();

		int[] array = new int[max + 1];

		int sum = 0;

		for (int i = 0; i < max; i++) {
			System.out.print("Please enter " + i + " number:");
			array[i] = input.nextInt();
		}

		System.out.println("The numbers that will be averaged:");

		for (int i = 0; i < max; i++){
			System.out.print(array[i] + " ");
		   if((i+1) % 5 == 0)
			      System.out.print("\n");
	}
		for (int i = 0; i < max; i++) {
			sum = array[i] + sum;
		}

		int avg;
		avg = sum / max;
		System.out.println("Average is: " + avg);

		input.close();
	}
}