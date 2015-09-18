/*Calculator by Henry and Opeyemi */
import java.util.Scanner;

public class SimpleCalculator {
	public static  Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		init();
	}

	public static void init( ){
		String ans;
		int a;

		do{
		System.out.println("Select Operation");
		System.out.println("     1 )  Addition");
		System.out.println("     2 )  Subtraction");
		System.out.println("     3 )  Multiplication");
		System.out.println("     4 )  Division");
		System.out.println("     5 )  Modulus");
		System.out.println("     6 )  Square Root");
		System.out.println("     7 )  Average");
		int op = in.nextInt();
		
		if (op ==1 || op == 2 || op == 3 || op ==4 || op == 7)
		{
		System.out.println("Enter First Number");
		int x = in.nextInt();
		System.out.println("Enter Second Number");
		int y = in.nextInt();
		

		switch(op){
			   case 1:  add(x,y);
			   	  break;
			   case 2:  sub(x,y);
			   	  break;
			   case 3:  mul(x,y);
			   	  break;
			   case 4:  div(x,y);
			   	  break;
			   case 7:  avg(x,y);
			   	  break;
		   	  }

		} else if (op == 5){

			System.out.println("Enter Numerator");
			int x = in.nextInt();
			System.out.println("Enter Denominator");
			int y = in.nextInt();
			mod(x,y);

		} else if (op == 6){
			System.out.println("Enter Number");
			double x = in.nextInt();
			sqrt(x);
		}


		System.out.println("Do You wanna run another operation? ");
		System.out.println("Enter");
		System.out.println("           1 )    To Run Another Operation");
		System.out.println("           2)     To  End Program");
		a = in.nextInt();
		
		}while( a == 1);
	}

	
	public static void add(int x, int y) {
		System.out.println(("Sum of "+x+ " + " + y+" = ")+(x+y));	
	}

	public static void sub(int x, int y) {
		System.out.println(("The Subtraction of "+x+ " - " + y+" = ")+(x-y));	
	}

	public static void mul(int x, int y) {
		System.out.println(("The Product of "+x+ " * " + y+" = ")+(x*y));	
	}

	public static void div(int x, int y) {
		System.out.println(("The Dividend of "+x+ " / " + y+" = ")+(x/y));	
	}

	public static void mod(int x,  int y) {
		System.out.println(("Remainder when you divide "+x+ " by " + y+" is: ")+(x%y));	
	}

	public static void sqrt(double x) {
		System.out.println("The Square Root of "+x + " is  "+Math.sqrt(x));
	}

	public static void power(double x, double y) {
		System.out.println(x+" raised to power "+y+" is");
	}

	public static void avg(int x, int y) {
		System.out.println(("Average of "+x+ " + " + y+" = ")+((x+y)/2));
	}

}