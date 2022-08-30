import java.util.*;

public class NumberTriangle{
	
	public static void main(String arg[]){
		
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int number = ob.nextInt();
		
		for(int i=1; i<=number; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i+"\t");
			}
			System.out.println();	
		}
	}
}