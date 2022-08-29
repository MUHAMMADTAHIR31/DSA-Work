import java.util.*;

public class NumberOfMonth{
	
	public static void main(String arg[]){
		
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter Number Of Days: ");
		int number = ob.nextInt();
		
		int days = number % 30;
		int months = number / 30;
	
		System.out.println(months+" Months "+days+" Days");
	}
}