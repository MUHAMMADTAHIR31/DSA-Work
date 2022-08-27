class BubbleSort{
	
	public static void main(String arg[]){
		
		int c,d,n,swap;
		
		java.util.Scanner ob = new java.util.Scanner(System.in);
		
		// number of elemnts in Array
		n = ob.nextInt();
		
		int[] array = new int[n];
		
		for(c=0; c<n; c++)
		array[c] = ob.nextInt();
		
		for(c=0; c<n-1; c++){
			for(d=0; d< n-c-1; d++){
				if(array[d] > array[d+1]){
					swap = array[d];
					array[d]=array[d+1];
					array[d+1]=swap;
				}
			}
		}
		
		for(c=0; c<n; c++)
		System.out.print("Array ["+array[c]+"]");
		
	}
}