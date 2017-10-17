import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {

		/*I renamed the trials and sample numbers to go by more easier numbers to keep track of,
		 *since many people don't recognize that 0 comes before 1. 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Hello!");

		System.out.println("");

		//This code just makes the program stop for a few seconds:
		try {
			Thread.sleep(2000);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}

		System.out.println("Let's begin our calculations.");

		System.out.println("");

		try {
			Thread.sleep(2000);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}

		//Sample size (maximum amount of numbers per trial)
		System.out.print("Please enter the sample size: ");
		int max = input.nextInt();

		while (max <= 0){
			System.out.print("Dude, enter a better sample size:");
			max = input.nextInt();
		}

		//Arrays1
		int[]samp0 = new int [max + 1];
		int[]samp1 = new int [max + 1];
		int[]samp2 = new int [max + 1];
		int[]samp3 = new int [max + 1];

		//Variables in each trial
		int count = 0, total = 0, num;
		int count1 = 0, total1 = 0, num1;
		int count2 = 0, total2 = 0, num2;
		int count3 = 0, total3 = 0, num3;

		System.out.println("");

		//First Trial
		{
			System.out.println("Enter numbers for Trial 1");
			for (int i = 0; i < max; i++) {
				System.out.print("Enter sample #" + (i + 1) + ":");
				num = input.nextInt();
				while (num == 0){
					System.out.println("How's that even possible? Enter a different number.");
					num = input.nextInt();
				}
				if (num > 0 || num < 0) {
					samp0[i] = num;
					total += num;
					count++;
					samp0[max] = total/count;
				}
			}
		}

		System.out.println("");

		//Second Trial
		{
			System.out.println("Enter numbers for Trial 2");
			for (int i = 0; i < max; i++) {
				System.out.print("Enter sample #" + (i + 1) + ":");
				num1 = input.nextInt();
				while (num1 == 0){
					System.out.println("How's that even possible? Enter a different number.");
					num1 = input.nextInt();
				}
				if (num1 > 0 || num1 < 0) {
					samp1[i] = num1;
					total1 += num1;
					count1++;
					samp1[max] = total1/count1;
				}
			}
		}

		System.out.println("");

		//Third Trial
		{
			System.out.println("Enter numbers for Trial 3");
			for (int i = 0; i < max; i++) {
				System.out.print("Enter sample #" + (i + 1) + ":");
				num2 = input.nextInt();
				while (num2 == 0){
					System.out.println("How's that even possible? Enter a different number.");
					num2 = input.nextInt();
				}
				if (num2 > 0 || num2 < 0); {
					samp2[i] = num2;
					total2 += num2;
					count2++;
					samp2[max] = total2/count2;
				}
			}
		}

		System.out.println("");

		//Fourth Trial
		{
			System.out.println("Enter numbers for Trial 4");
			for (int i = 0; i < max; i++) {
				System.out.print("Enter sample #" + (i + 1) + ":");
				num3 = input.nextInt();
				while (num3 == 0){
					System.out.println("How's that even possible? Enter a different number.");
					num3 = input.nextInt();
				}
				if (num3 > 0 || num3 < 0); {
					samp3[i] = num3;
					total3 += num3;
					count3++;
					samp3[max] = total3/count3;
				}
			}
		}

		System.out.println("");

		System.out.println("Now calculating...");

		System.out.println("");

		try {
			Thread.sleep(2500);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}

		//Results table
		System.out.println("Your results:");

		System.out.println("");

		System.out.println("\tSample #\tTrial 1   \tTrial 2   \tTrial 3   \tTrial 4"); 
		for (int i = 0; i < max; i++) {
			System.out.print("\t" + (i + 1) + "\t\t" + samp0[i] + "\t\t" + samp1[i]);
			System.out.println("\t\t" + samp2[i] + "\t\t" + samp3[i]);
		}
		System.out.println("\t----------------------------------------------------------------------");

		System.out.print("Average:\t\t" + samp0[max] + "\t\t" + samp1[max]);
		System.out.println("\t\t" + samp2[max] + "\t\t" + samp3[max]);

		System.out.println(" ");

		//Minimum, Maximum Variables
		int minimum = 0, maximum = 0;

		//Arrays2
		int[]avg = new int[4];

		avg[0] = samp0[max];
		avg[1] = samp1[max];
		avg[2] = samp2[max];
		avg[3] = samp3[max];

		//Minimum
		if (avg[0] < avg[1])
			minimum = avg[0];
		else if (avg[1] < avg[2])
			minimum = avg[1];
		else if (avg[2] < avg[3])
			minimum = avg[2];
		else
			minimum = avg[3];

		//Maximum
		if (avg[0] > avg[1])
			maximum = avg[0];
		else if (avg[1] > avg[2])
			maximum = avg[1];
		else if (avg[2] > avg[3])
			maximum = avg[2];
		else
			maximum = avg[3];

		System.out.println("Minimum Average: " + minimum);
		System.out.println("Maximum Average: " + maximum);

		System.out.println(" ");

		//Comparisons
		{
			if (minimum == maximum) {
				System.out.println("The trials match EXACTLY!");
			}
			else if ((minimum * 2) > maximum) {
				System.out.println("The trials concur with each other!");
			}
			else if (minimum < maximum) {
				System.out.println("The trials do NOT concur!");
			}
		}

		System.out.println(" ");

		System.out.println("Thank you and have a nice day!");

		//Scanner close code
		input.close();
	}
}