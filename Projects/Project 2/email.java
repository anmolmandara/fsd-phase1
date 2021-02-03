package learnjava;
import java.util.Scanner;

public class email {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your email");
		String s = input.nextLine();
	
		
		EmailValidation e = new EmailValidation();
		System.out.println( e.emailValid(s) ? s+" is a valid email" : s+ " is not a valid email");
		
		EmailSearch es = new EmailSearch();
		System.out.println( es.Search(s) ? s+" was found" : s+ " was not found");
		
		

	}

}
