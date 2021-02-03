package learnjava;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	
	final static String r = "^[A-Za-z0-9+_.-]+@(.+)$";
	final static Pattern p = Pattern.compile(r, Pattern.MULTILINE);
		
	public static boolean emailValid(String sv) {
        Matcher matcher  = p.matcher(sv);
        return matcher.find();
    }
	
}

