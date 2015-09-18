/*Insert your card
Enter your pin
Choose Transaction you want to perform 
Type the amount you want to withdraw
Print a Static Number*/


import java.util.Scanner;


public class atm {
	public static  Scanner in = new Scanner(System.in);

	public static void main(int x, int y) {

		System.out.println("Select Operation");
		int op = in.nextInt();

		x = in.nextInt();
		y = in.nextInt();

		System.out.println("Addition Operation");

		

		switch(op){
			   case 1:  add(x,y);
			   	  break;
			   case 2:  sub(x,y);
			   	  break;
			   case 3:  mul(x,y);
			   	  break;
			   case 4:  div(x,y);
			   	  break;
		   	  }

	}

	public static void add(int x, int y) {
		System.out.println(("Sum of "+x+ " + " + y+" = ")+(x+y));	
	}

	public static void sub(int x, int y) {
		System.out.println(("Sum of "+x+ " - " + y+" = ")+(x-y));	
	}


	public static void mul(int x, int y) {
		System.out.println(("Sum of "+x+ " * " + y+" = ")+(x*y));	
	}


	public static void div(int x, int y) {
		System.out.println(("Sum of "+x+ " / " + y+" = ")+(x/y));	
	}


	public static void sayMyName() {
		System.out.println("Enter Your Name: ");
		String name = in.nextLine() ;
		System.out.println("Your Name is: "+name);

	}

	public static void sayMyAge() {
		System.out.println("Enter Your Age: ");
		System.out.println("Your Name is: "+new Scanner(System.in).nextInt());

	}

	public static void forLoop() {
		Scanner in = new Scanner(System.in);

		int add, sum=0;


		for ( int i = 1; i<= 10; i++ ){
			System.out.println("Enter number " + i)  ;
			add = in.nextInt();
			sum += add;
		}

		System.out.println("Sum of nos = "+sum);
		
	}


	public static void whileLoop(String[] args) {
		Scanner in = new Scanner(System.in);

		int i =1, add, sum=0;


		while ( i<= 10 ){
			System.out.println("Enter number " + i)  ;
			add = in.nextInt();
			sum += add;

			i++;
		}

		System.out.println("Sum of nos = "+sum);
		
	}


	public static void simpleAtm(String[] args) {

		int pinNo, op, card, amount;
		String name="";
		String message = "";

		Scanner in = new Scanner(System.in);

		System.out.println("Insert ATM CARD! Press 1 to continue");

		card = in.nextInt();

		if(card == 1) {

			System.out.println("Enter Your PIN NO:");

			pinNo = Integer.parseInt(in.nextLine());


			System.out.println("Choose  the account type:");

			System.out.println("Choose Operation");
			System.out.println("    1 ) Balance inquiry ");
			System.out.println("    2) Withdrawal");

			op = Integer.parseInt(in.nextLine());

			if (op == 1){
				message = "Henry, your Balance is $1,000,000";

			} else if (op == 2){
				System.out.println("Enter Amount you want to withdraw: ");
					amount = Integer.parseInt(in.nextLine());
					      System.out.println( "You have withdrawn $" +amount );


			}else {
				message = "Wrong Number Entered! Bye";
			}

			System.out.println(message);

		} else {
			System.out.println("You have not inserted your card correctly");
		}
		


		




	}





}