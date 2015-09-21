 /*Calculator by Henry and Opeyemi */
import java.util.Scanner;

public class FigureInWords{
	public static  Scanner in = new Scanner(System.in);

	public static  String  [] units = {"", " one ", " two ", " three ", " four ", " five ", " six ", " seven ", " eight ",
			" nine ", " ten ", " eleven ", " twelve ", " thirteen ", " fourteen ", " fifteen ",
			" sixteen ", " seventeen ", " eighteen ", " nineteen " } ;

	public static  String [] tens = {"", ""," twenty ", " thirty ", " fourty ", " fifty ", " sixty ", " seventy ", " eighty ", " ninty "};
	public static  String [] big = {" hundred ", " thousand ", " million ", " billion "};
	public static  int unit, ten, hundred, thousand,tenThousand, tenMillion, hundredThousand, million, toTenMillion, hundredMillion, toHundredMillion, billion, tenUnit, tohundred, toThousand, toTenThousand, toHundredThousand, toMillion;
	public static  String word = "",s = "", str = "hundred ";
	
	public static void main(String[] args) {   

		System.out.println("Enter a number to convert to words (or 'done' to quit):");
		String numb = in.nextLine();

		while(!(numb.equals ("done"))) {
			 try {
			         int num = Integer.parseInt(numb);
			            init(num);
			        } 
			    catch (NumberFormatException ex){
			        System.out.println("You have Entered the worng value");
			    };
			    System.out.println("Enter a number to convert to words (or 'done' to quit):");
			    numb = in.nextLine();
			    word="";
			    s="";
		};
		System.out.println(" Thank you for using our service");
	}

	public static void init(int num ){


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
	               		s = "negative ";
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
			if(tenUnit == 0) str = "";
			word = units[hundred] +str+ word;
		return word;

	}
	
	public static String thousands(int num) {
			thousand = num/1000;
			tohundred = num %1000;
			hundreds(tohundred);
			if(thousand == 0) str = "";
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
			toTenThousand = num % 100000; 
			 if (toTenThousand  != 0) str = "hundred and";
			 if(toTenThousand == 0) str = "";
			tenThousands(toTenThousand);
			word = units[hundredThousand]+ str +word;
		return word;		
	}


	public static String  millions(int num) {
			million = num/1000000;
			toHundredThousand = num % 1000000; 
			hundredThousands(toHundredThousand);
			word = units[million] +big[2] +word;
		return word;			
	}

	public static String  tenMillions(int num) {
			tenMillion = num/10000000;
			toMillion = num % 10000000; 
			millions(toMillion);
			word = tens[tenMillion]  +word;
		return word;
			
	}

	public static String  hundredMillions(int num) {
			hundredMillion = num/100000000;
			toTenMillion = num % 100000000; 
			tenMillions(toTenMillion);
			 if (toTenMillion  != 0) str = "hundred and";
			 if(toTenMillion == 0) str = "";
			word = units[hundredMillion] +str  +word;
		return word;
			
	}

	public static String billions(int num) {
			billion = num/1000000000;
			toHundredMillion = num %1000000000;

			hundredMillions(toHundredMillion);
			word = units[billion] + big[3] +word;
		return word;

	}
		
	

}

