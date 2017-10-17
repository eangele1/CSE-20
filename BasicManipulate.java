package lab4;

import java.util.Scanner;

public class BasicManipulate {
	
	public static void main(String[] args) {
		
	System.out.println("This is the 'int' data type.");
		
		Scanner input = new Scanner(System.in);

		int n1;
		int n2;

		System.out.println("Please enter the first number: ");
		n1 = input.nextInt();
		
		System.out.println("Please enter the second number: ");
		n2 = input.nextInt();
		
		int sum;
		sum = (n1+n2);
		System.out.print("The sum of the numbers is ");
		System.out.println(sum);
		
		int diff;
		diff = (n1-n2);
		System.out.print("The difference of the numbers is ");
		System.out.println(diff);
		
		int prod;
		prod = (n1*n2);
		System.out.print("The product of the numbers is ");
		System.out.println(prod);
		
		int quot;
		quot = (n1/n2);
		System.out.print("The quotient of the numbers is ");
		System.out.println(quot);
		
		int rema;
		rema = (n1%n2);
		System.out.print("The remainder of the quotient of the numbers is ");
		System.out.println(rema);
		
	System.out.println("This is the 'short' data type.");
		
		short n3;
		short n4;

		System.out.println("Please enter the first number: ");
		n3 = input.nextShort();
		
		System.out.println("Please enter the second number: ");
		n4 = input.nextShort();
		
		short sum1;
		sum1 = (short) (n3+n4);
		System.out.print("The sum of the numbers is ");
		System.out.println(sum1);
		
		short diff1;
		diff1 = (short) (n3-n4);
		System.out.print("The difference of the numbers is ");
		System.out.println(diff1);
		
		short prod1;
		prod1 = (short) (n3*n4);
		System.out.print("The product of the numbers is ");
		System.out.println(prod1);
		
		short quot1;
		quot1 = (short) (n3/n4);
		System.out.print("The quotient of the numbers is ");
		System.out.println(quot1);
		
		short rema1;
		rema1 = (short) (n3%n4);
		System.out.print("The remainder of the quotient of the numbers is ");
		System.out.println(rema1);
		
	System.out.println("This is the 'float' data type.");
		
		float n5;
		float n6;

		System.out.println("Please enter the first number: ");
		n5 = input.nextFloat();
		
		System.out.println("Please enter the second number: ");
		n6 = input.nextFloat();
		
		float sum2;
		sum2 = (float) (n5+n6);
		System.out.print("The sum of the numbers is ");
		System.out.println(sum2);
		
		float diff2;
		diff2 = (float) (n5-n6);
		System.out.print("The difference of the numbers is ");
		System.out.println(diff2);
		
		float prod2;
		prod2 = (float) (n5*n6);
		System.out.print("The product of the numbers is ");
		System.out.println(prod2);
		
		float quot2;
		quot2 = (float) (n5/n6);
		System.out.print("The quotient of the numbers is ");
		System.out.println(quot2);
		
		float rema2;
		rema2 = (float) (n5%n6);
		System.out.print("The remainder of the quotient of the numbers is ");
		System.out.println(rema2);
		
	System.out.println("This is the 'double' data type.");
		
		double n7;
		double n8;

		System.out.println("Please enter the first number: ");
		n7 = input.nextFloat();
		
		System.out.println("Please enter the second number: ");
		n8 = input.nextFloat();
		
		double sum3;
		sum3 = (double) (n7+n8);
		System.out.print("The sum of the numbers is ");
		System.out.println(sum3);
		
		double diff3;
		diff3 = (double) (n7-n8);
		System.out.print("The difference of the numbers is ");
		System.out.println(diff3);
		
		double prod3;
		prod3 = (double) (n7*n8);
		System.out.print("The product of the numbers is ");
		System.out.println(prod3);
		
		double quot3;
		quot3 = (double) (n7/n8);
		System.out.print("The quotient of the numbers is ");
		System.out.println(quot3);
		
		double rema3;
		rema3 = (double) (n7%n8);
		System.out.print("The remainder of the quotient of the numbers is ");
		System.out.println(rema3);
	}

}
