/*Calculator by Henry and Opeyemi */
import java.util.Scanner;

public class NumToWord{
	public static  Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		init();
	}

	public static void init( ){
		
		System.out.println("Enter Number");
		int num = in.nextInt();
		String word = "";


		String  [] units = {
			"", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
			"sixteen", "seventeen", "eighteen", "nineteen" 
		} ;

		String [] tens = {
			"", "","twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"
		};

		String [] big = {
			"hundred", "thousand", "million", "billion"
		};


		if (num < 20){
			word = units[num];
		}

		System.out.println(word);
	}


	public static String  unit(String[] units, int num) {
		System.out.println("hi");	
		return num + "";
	}

	public static void avg(int x, int y) {
		System.out.println(("Average of "+x+ " + " + y+" = ")+((x+y)/2));
	}

}