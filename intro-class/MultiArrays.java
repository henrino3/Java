import java.util.Scanner;

public class MultiArrays{
	public static Scanner in= new Scanner (System.in);

	public static void main(String[] args) {
		
		init();

	}

	public static void init() {
		
		String[][] names =  {
			{"Mr", "Mrs", "Ms"},
			{"Smith", "Jones"}
		};

		
		flow(names );

		
	}

	public static void flow(String[][] names) {
		for (int i =0 ;i < names.length ; i++ ) {
			System.out.println();
			
		}
	}

	public static void flow(String[][] names) {
		for (int i =0 ;i < names.length ; i++ ) {
			for (int j =0; j < names[1].length ;i++ ) {
				System.out.println(named[0][i] + names [1][j]);	
			}
		}
	}

		





}


