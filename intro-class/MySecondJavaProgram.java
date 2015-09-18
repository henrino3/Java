import java.util.Scanner;
import java.util.NoSuchElementException;



public class MySecondJavaProgram  {



	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int name;
		String  message;
/*
		System.out.println("Enter Name");

		if (in.hasNextInt()) {

			name = in.nextInt();

			message = "Your name is " + name;
			
		}else {
			message = "No name Entered!";
		}

		System.out.println(message);
*/


			System.out.println("****************************************");
			System.out.println("****************************************");
			System.out.println("****************************************");
			System.out.println("****************************************");
			System.out.println("****************************************");


		int x,y;
/*
		System.out.println("Enter first no");

		if (in.hasNextInt()) {
			x = in.nextInt();
			System.out.println("Enter Second no");
				if (in.hasNextInt()) {
					y = in.nextInt();
					System.out.println("The Max of both is: "+ Math.max(x,y));
					return;
				}

				message = "Error: Only one number entered";
		} else {
			message = "No number Entered";
		}

		System.out.println(message);*/  // IN EFFICIENT COS YOU HAVE TO MANUALLY CHECK INPUT USING IF 

		System.out.println("Enter first no");
		try{
			x = in.nextInt();

			System.out.println("Enter Second no");

			y = in.nextInt();

			System.out.println("The Max of both is: "+ Math.max(x,y));

		}
		catch(NoSuchElementException e){
			System.err.println( "Error: need two ints" );
		}







	}
	
}