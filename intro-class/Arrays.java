import java.util.Scanner;

public class Arrays{
	public static Scanner in= new Scanner (System.in);

	public static void main(String[] args) {
		
		init();

	}

	public static void init() {
		
		double[] array =  {1,2,3,4,5};
		multiply(array );

		
	}

	public static void add(double[] array) {
		

		double sum = 0;

		for(int count = 1; count < array.length; count++ ){
		    sum += array[count];
		}	
		 System.out.println("The sum is "+sum);
	}

	public static void multiply(double[] array) {
		

		double product = 1;

		for(int count = 1; count < array.length; count++ ){
		    product = product * array[count];
		}	
		 System.out.println("The Product is "+product);
	}





}


