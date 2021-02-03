package learnjava;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	
	final static String r = "^[A-Za-z0-9+_.-]+@(.+)$";
	final static Pattern p = Pattern.compile(r, Pattern.MULTILINE);
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your email");
		String s = input.nextLine();
		
		System.out.println( emailValid(s) ? s+" is a valid email" : s+ " is not a valid email");
	    }
	

	public static boolean emailValid(String stringToValidate) {
        Matcher matcher  = p.matcher(stringToValidate);
        return matcher.find();
    }
	
}

