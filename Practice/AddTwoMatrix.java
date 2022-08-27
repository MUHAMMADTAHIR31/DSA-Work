import java.util.*;

class AddTwoMatrix{
	
	public static void main(String arg[]){
	
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter The Length of Matrix");
		
		int m = ob.nextInt();
		int n = ob.nextInt();
	
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		int sum[][] = new int[m][n];
		
		int i,j;
		
		System.out.println("Enter The First Matrix");
		// First Matrix
		for( i=0; i<m; i++)
		  for( j=0; j<n; j++)
			a[i][j] = ob.nextInt();
		
		System.out.println("Enter The Second Matrix");
		// Second Matrix
		for( i=0; i<m; i++)
		  for( j=0; j<n; j++)
			b[i][j] = ob.nextInt();
		
		
		// Addition 
		for( i=0; i<m; i++)
		  for( j=0; j<n; j++)
			sum[i][j] = a[i][j] + b[i][j];
		
		System.out.println(" Sum Of Matrix");
		// Addition Matrix
		for( i=0; i<m; i++)
		  for( j=0; j<n; j++)
			System.out.print(sum[i][j]+" \t");
		
	}
}