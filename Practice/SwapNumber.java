import java.util.*;

public class SwapNumber{
	
	public static void main(String arg[]){
		
		int a=0, b=0 , c=1;
		
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter Number:1");
		int number1 = ob.nextInt();
		
		System.out.println("Enter Number:2");
		int number2 = ob.nextInt();
		
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
	
		System.out.println(number1+"\t"+number2);
	}
}