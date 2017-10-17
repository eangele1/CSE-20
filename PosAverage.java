import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int i = 0, total = 0, num = 0;
		
		do {
			System.out.println("Enter " + i + " number:");
			num = input.nextInt();
			if(num > 0){
			total += num;
			i++;
			}
		} while (num > 0);
		
		System.out.println("Average is " + (total/i));
		
		input.close();
	}
}