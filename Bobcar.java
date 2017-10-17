import java.util.Scanner;

public class Bobcar {

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		double result3 = 0, total;

		int result2 = 0, econ, comp, stand, choice, car = 0, rent, memb, plat = 0, result1;

		econ = 35;
		comp = 45;
		stand = 95;

		String car2 = null;

		System.out.println("Hello!");

		try {
			//sleep 1.5 seconds
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Welcome to the BobCar™ Rent-a-Car Cost Estimator!");

		try {
			//sleep 2.5 seconds
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\t");

		System.out.println("These are the cars that we offer for rent:");
		System.out.println("•Economy @$35 (1)");
		System.out.println("•Compact @$45 (2)");
		System.out.println("•Standard @$95 (3)");

		try {
			//sleep 3.5 seconds
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\t");

		System.out.println("Choose your rental car. (Type 1, 2 or 3 to choose.)");

		choice = input.nextInt();

		while (choice > 3 || choice <= 0){
			System.out.println("Please enter a valid number.");
			choice = input.nextInt(); 
		}
		if (choice == 1){
			car = econ;
			car2 = "Economy";
		}
		else if (choice == 2){
			car = comp;
			car2 = "Compact";
		}
		else if (choice == 3){
			car = stand;
			car2 = "Standard";
		}

		System.out.println("\t");

		System.out.println("Enter the number of rental days.");

		rent = input.nextInt();
		
		while (rent == 0 || rent < 0){
			System.out.println("Please enter a valid number.");
			rent = input.nextInt(); 
		}

		result1 = car * rent;

		System.out.println("\t");

		System.out.println("Are you a club member? (Type 1 for yes and 0 for no.)");

		memb = input.nextInt();

		while (memb < 0 || memb > 1){
			System.out.println("Please enter a valid number.");
			memb = input.nextInt(); 
		}
		if (memb == 1 && rent < 7){
			result2 = 0;
			System.out.println("\t");
		}
		else if (memb == 1 && rent >= 21){
			result2 = car * 3;
			System.out.println("\t");
		}
		else if (memb == 1 && rent >= 14){
			result2 = car * 2;
			System.out.println("\t");
		}
		else if (memb == 1 && rent >= 7){
			result2 = car * 1;
			System.out.println("\t");
		}
		else if (memb == 0)
			EmptyStatement:
				;

		while (plat > 1 || plat < 0){
			System.out.println("Please enter a valid number.");
			plat = input.nextInt(); 
		}
		if (memb == 1){
			System.out.println("Would you like the Platinum Executive Package? (Type 1 for yes and 0 for no.)");
			plat = input.nextInt();
		}
		if (plat == 1){
			result3 = result1 * .15;
		} else if (plat == 0)
			EmptyStatement:
				;

		System.out.println("\t");
		System.out.println("****");

		try {
			//sleep 4 seconds
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\t");

		System.out.println("Base Price: ");
		System.out.println(rent + " day(s) for a(n) " + car2 + " @ " + "$" + car + " per day:");
		System.out.println("$" + result1);

		System.out.println("\t");

		if (memb == 1) {
			System.out.println("Club Member Discount:");
			System.out.println("-" + "$" + result2);

			System.out.println("\t");
		} else if (memb == 0){
			EmptyStatement:
				;
		}

		if (plat == 1){
			System.out.println("Platinum Executive Package:");

			System.out.println("+" + "$" + result3);

			System.out.println("\t");
		} else if (plat == 0){
			EmptyStatement:
				;
		}

		System.out.println("Grand Estimated Total Cost for Rental:");

		total = result1 - result2 + result3;

		System.out.println("$" + total);

		System.out.println("\t");
		System.out.println("\t");

		try {
			//sleep 3.5 seconds
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thank you for using the BobCar™ Rent-a-Car Cost Estimator!");
		System.out.println("Have a nice day!");

		input.close(); //For Resource leak warning. input is the name of scanner.

	}
}