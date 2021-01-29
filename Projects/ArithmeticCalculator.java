package learnjava;
import java.util.Scanner;


public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What do you want to calculate? Please enter Multiply, Add, Divide, or Subtract ");
		String s = input.next();
		
		if(s.equals("Multiply")) {
			System.out.print("Enter two numbers ");
			double x = input.nextDouble();
			double y = input.nextDouble();
			double z = x*y;
			System.out.print("The numbers multiply to "+z);

		}
		else if(s.equals("Add")) {
			System.out.print("Enter two numbers ");
			double x = input.nextDouble();
			double y = input.nextDouble();
			double z = x+y;
			System.out.print("The numbers add to "+z);

		}
		else if(s.equals("Divide")) {
			System.out.print("Enter two numbers ");
			double x = input.nextDouble();
			double y = input.nextDouble();
			double z = x/y;
			System.out.print("The numbers divide to "+z);
		}
		else if(s.equals("Subtract")) {
			System.out.print("Enter two numbers ");
			double x = input.nextDouble();
			double y = input.nextDouble();
			double z = x-y;
			System.out.print("The numbers multiply to "+z);

		}
		else {
			System.out.println("Not a valid selection");
		}
	
	}

}
