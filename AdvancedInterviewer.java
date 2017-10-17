package lab4;

import java.util.Scanner;

public class AdvancedInterviewer {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		String name;
		//Question 1
		System.out.print("What is your name? ");
		name = input.nextLine();
		
		String name1;
		//Question 2
		System.out.print("What is your major? ");
		name1 = input.nextLine();
		
		//Question 3
		int age;
		System.out.print("When will you graduate? ");
		age = input.nextInt();
		
		String name2;
		//Question 4
		System.out.print("What's your ethnicity? ");
		name2 = input.next();
		
		String name3;
		//Question 5
		System.out.println("What's your nickname?");
		name3 = input.next();
		
		//Question 6
		int num;
		System.out.print("What is your weight in lbs.?");
		num = input.nextInt();
		
		int weight;
		weight = (int) (num / 2.2);
		
		System.out.print("");;
		
		System.out.print("Their name is ");
		System.out.println(name + ".");
		System.out.print("Their major is ");
		System.out.println(name1 + ".");
		System.out.print("They will graduate in ");
		System.out.println(age + ".");
		System.out.print("They are ");
		System.out.println(name2 + ". Cool!");
		System.out.print("Their nickname is ");
		System.out.println(name3 + ".");
		System.out.print("Their weight is ");
		System.out.println(weight + " in kg.");
	
	}
}