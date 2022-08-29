public class FibonacciSeries{
	
	public static void main(String arg[]){
		
		int a=0, b=0 , c=1;
		
		java.util.Scanner ob = new java.util.Scanner(System.in);
		System.out.println("Enter Range For Fibonacci Series :");
		int number = ob.nextInt();
		
		System.out.println("Fibonacci Series :");
		
		for(int i=1; i<=number; i++ ){
			
			a = b;
			b = c;
			c = a+b;
			
			System.out.print(a+"\t");
			
		}
	}
}