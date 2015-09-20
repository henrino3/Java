import java.util.Scanner;
import java.util.ArrayList;
public class Calc2{
	public static Scanner in = new Scanner(System.in);
	
	public static void add(float first, float second){
		System.out.println("Addition Result: " + (first + second));
	}
	public static void multiply(float first, float second){
		System.out.println("Multiplication Result of "+first+" & "+second+": " + (first * second));
	}
	public static void divide(float first, float second){
		System.out.println("Division Result of "+first+" & "+second+": " + (first / second));
	}
	public static void subtract(float first, float second){
		System.out.println("Subraction Result of "+first+" & "+second+": " + (first - second));
	}
	public static void modulus(float first, float second){
		System.out.println("Modulus Result of "+first+" & "+second+": " + (first % second));
	}
	public static void average(ArrayList<Integer> arr){
		int n = arr.size();
		int sum = 0;
		for (int i=0; i < n; i++) {
			sum += arr.get(i);
		}
		System.out.println("Average Result of "+arr.get(0)+" & "+arr.get(1)+": " + (sum/n));
	}
	public static void squareRoot(float first){
		double check;
		double result = first / 2 ;

		do{
			check = result;
			result = (check + ( first / check)) /2;
			System.out.println(check+" : "+result);
		}while((check- result) != 0);
		System.out.println("Square root Result of "+first+": " + result);
	}
	public static void power(float first, int second){
		double pow = 1;
		int i = second;
		while(i > 0){
			pow *= first;
			i--;
		}
		System.out.println("Power Result of "+first+" to power of "+second+": " + pow);
	}

	public static void main (String[] args){
		float a = 0,b = 0;
		boolean done = false;
		String mes = "";

		while(!done){
			done = true;
			System.out.print("What to do? \n'1' - Add\n'2' - Subtract\n'3' - Multiply"
			+"\n'4' - Divide\n'5' - Modulus\n'6' - Average\n'7' - Power\n'8' - Square root\nSelect one? ");
			int resp = in.nextInt();
			if (resp < 8) {
				System.out.print("First number? ");
				a = in.nextFloat();
				System.out.print("Second number? ");
				b = in.nextFloat();
			}else if(resp == 8){
				System.out.print("Enter a number: ");
				a = in.nextFloat();
			}

			if (resp == 1) {
				add(a,b);			
			}else if (resp == 2) {
				subtract(a,b);
			}else if(resp == 3){
				multiply(a,b);
			}else if(resp == 4){
				divide(a,b);
			}else if(resp == 5){
				modulus(a,b);
			}else if(resp == 6){
				if((a == Math.round(a)) && (b == Math.round(b))){
					ArrayList<Integer> out = new ArrayList<Integer>();
					out.add(Math.round(a));
					out.add(Math.round(b));
					average(out);
				}else{
					done = false;
					mes = "Both numbers have to be integers from  '- 2,147,483,648 to  - 2,147,483,647";
				}

			}else if(resp == 7){
				if(b == Math.round(b)){
					power(a,Math.round(b));
				}else{
					done = false;
					mes = "Your second input must be an integer";
				}
			}
			else if(resp == 8){
				squareRoot(a);
			}else{
				done = false;
			}
			if (!done)
				System.out.println("Wrong input! \n"+mes);
		}
	}
}

/*•	add, a method that takes 2 numbers as arguments (not only integers) and prints their sum.
•	subtract, a method that takes 2 numbers as arguments (not only integers) and prints their difference.
•	divide, a method that takes 2 numbers as arguments (not only integers) and prints their quotient. This one is a little tricky. Let's see if you figure it out. That'd be awesome!
•	multiply, a method that takes 2 numbers as arguments (not only integers) and prints their product.
•	squareRoot, a method that takes an integer and prints its square root.
•	modulus, a method that takes 2 arguments, a and b, and finds a mod b.
•	average, a method that takes 2 integers and finds their average. This is hard to get right so think hard about it.

*/