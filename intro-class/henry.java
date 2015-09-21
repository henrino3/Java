
import java.util.Scanner;

public class henry {
	public static  Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
	          
	          System.out.println("Enter Number");
	          int num = in.nextInt();
	          String word ="";
	          String s = "";

	            if (num < 0) {
	               		num *= -1;
	               		s = "minus";

	               }

	       int digit = 0;
	            int temp = num;
	            while(temp>0)
	               {
	                if (temp%10 >= 0){
	        	      digit++;
	                      temp = temp/10;	
	                };
	              };

	              



	            if (digit ==1 ){
	            	System.out.println("Your number has " +digit+" digit");
	            };

	            if (digit == 2){
	            System.out.println("Your number has " +digit+" digits");
	            };

	            if (digit == 3){
	            System.out.println("Your number has " +digit+" digits");
	            };
	            if (digit == 4){
	            System.out.println("Your number has " +digit+" digits");
	            };
	            if (digit == 5){
	            System.out.println("Your number has " +digit+" digits");
	            };
	}
    
}
