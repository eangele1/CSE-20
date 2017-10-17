import java.util.Scanner;

public class BasicInterviewer {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
	String name;
	//Question 1
	System.out.print("What is your name? ");
	name = input.nextLine();
	
	System.out.print("Their name is ");
	
	System.out.println(name + ".");
	
	//Question 2
	System.out.print("What is your major? ");
	name = input.nextLine();
	
	System.out.print("Their major is ");
	
	System.out.println(name + ".");
	
	//Question 3
	int age;
	
	System.out.print("How old are you? ");
	age = input.nextInt();
	
	System.out.print("They are ");
	
	System.out.println(age + " years old.");
	
	//Question 4
	System.out.print("What year are you in? ");
	name = input.next();
	
	System.out.print("They are in their ");
	
	System.out.println(name + " year at UC Merced.");
	
	//Question 5
	System.out.print("What do you do in your free time? ");
	name = input.next();
		
	System.out.print("They like to (do) ");
		
	System.out.println(name + ".");
	
	}
}