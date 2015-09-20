import java.util.Scanner;

public class MethodOverload{
	public static Scanner in= new Scanner (System.in);



/*
	 A PROGRAM ACCEPTS  A PERSONS FIRST NAME  OR 
	AND MIDDLE NAME OR AND LAST NAME  PRINTS IT OUT

	public static void main(String[] args) {
	
	
	sayMyName("Henry","Henry", "Henry");


	}

	public static void sayMyName(String fname) {

		System.out.println("Your Name is  "+ fname);
	}

	public static void sayMyName(String fname, String lname) {

		System.out.println("Your two names are " + fname + " "+ lname);

		sayMyName(fname);
	}

	public static void sayMyName(String fname, String mname, String lname) {

		System.out.println("Your fullname is " + fname + " "+ mname + " "+ lname);

		sayMyName(fname,lname);






	

	DOING THE SAME THING IN ANOTHE LOGIC

	public static void main(String[] args) {
	

	String firstName= firstName();
	String middleName = middleName();
	String lastName = lastName();
	sayMyName(firstName, middleName, lastName);


	}

	

	public static void sayMyName(String fname, String mname, String lname) {

		System.out.println("Your fullname is " + fname + " "+ mname + " "+ lname);


	}

	public static void sayMyName(String fname, String mname) {
		String lname = "";
		sayMyName(fname,mname,lname); 

	}

	public static void sayMyName(String fname) {

		String mname = "" ;
		 String lname = "";
		sayMyName(fname,mname,lname); 

	}

	}*/


	public static void main(String[] args) {
	

	String firstName= firstName();
	String middleName = middleName();
	String lastName = lastName();
	sayMyName(firstName, middleName, lastName);


	}

	

	public static String firstName() {
		
		System.out.println("Enter Name ");
		String firstName = in.nextLine();
		return firstName;

	}

	public static String middleName() {
		
		System.out.println("Enter MiddleName ");
		String middleName = in.nextLine();
		return middleName;

	}

	public static String lastName() {
		
		System.out.println("Enter LastName ");
		String lastName = in.nextLine();
		return lastName;

	}

	public static void sayMyName(String firstName,String middleName,String lastName ) {
		System.out.println("Your name is "+firstName+" "+ middleName+ " "+ lastName);
		
	}
}


