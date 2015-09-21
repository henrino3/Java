/*Calculator by Henry and Opeyemi */
import java.util.Scanner;

public class NumToWord{
	public static  Scanner in = new Scanner(System.in);

	public static  String  [] units = {
			"", " one ", " two ", " three ", " four ", " five ", " six ", " seven ", " eight ",
			" nine ", " ten ", " eleven ", " twelve ", " thirteen ", " fourteen ", " fifteen ",
			" sixteen ", " seventeen ", " eighteen ", " nineteen " 
		} ;

	public static  String [] tens = {
			"", ""," twenty ", " thirty ", " fourty ", " fifty ", " sixty ", " seventy ", " eighty ", " ninty "
		};

	public static  String [] big = {
			" hundred ", " thousand ", " million ", " billion "
		};
	public static  int unit, ten, hundred, thousand,tenThousand, hundredThousand, million, billion, tenUnit, tohundred, toThousand, toTenThousand, toHundredThousand, toMillion;

	public static  String word = "",s = "", str = "hundred ";

	public static void main(String[] args) {   
		init();
	}

	public static void init( ){
		
		System.out.println("Enter Number");
		int num = in.nextInt();
		



	            int digit = 0;
	            int temp = num;
	            while(temp>0)
	               {
	                if (temp%10 >= 0){
	        	      digit++;
	                      temp = temp/10;	
	                };
	              };


	               if (num < 0) {
	               		num *= -1;
	               		s = "minus ";
	               }

	               if (num == 0) System.out.println("Zero");


		if (num < 20){
		     word = units[num]; 
		}

		if (digit == 2){
			tens(num);
		}

		if (digit == 3){
			hundreds(num);
		}

		if (digit == 4){
			thousands(num);
		}

		if (digit == 5){
			tenThousands(num);
		}

		if (digit == 6){
			hundredThousands(num);
		}

		if (digit == 7){
			millions(num);
		}

		if (digit == 8){
			tenMillions(num);
		}

		if (digit == 9){
			hundredMillions(num);
		}

		if (digit == 10){
			billions(num);
		}



		System.out.println(s+word);
	}

	public static String tens(int num) {
		if (num > 20){
			ten =   num/10;
			unit = num%10;
			word =tens[ten]+""+units[unit];
		};
		return word;

	}

	public static String hundreds(int num) {
			 hundred = num/100;
			 tenUnit= num%100;
			 if (tenUnit != 0) str = "hundred and";
			tens(tenUnit);
			word = units[hundred] +str+ word;
		return word;

	}
	
	public static String thousands(int num) {
			thousand = num/1000;
			tohundred = num %1000;
			hundreds(tohundred);
			word = units[thousand] + big[1] +word;
		return word;
	}  

	public static String tenThousands(int num) {
			tenThousand = num/10000;
			toThousand = num % 10000;
			thousands(toThousand);
			word = tens[tenThousand]+word;
		return word;

	}

	public static String hundredThousands(int num) {
			hundredThousand = num/100000;
			toHundredThousand = num % 100000;
			 if (toHundredThousand  != 0) str = "hundred and";
			tenThousands(toHundredThousand);
			word = units[hundredThousand]+ str +word;
		return word;

			
	}


	public static void  millions(int num) {

			
	}


	public static void  tenMillions(int num) {

			
	}


	public static void  hundredMillions(int num) {

			
	}

	public static String billions(int num) {
			thousand = num/1000;
			tohundred = num %1000;

			hundreds(tohundred);
			word = units[thousand] + big[1] +word;
		return word;

	}
		
	

}

