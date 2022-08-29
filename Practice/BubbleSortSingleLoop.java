public class BubbleSortSingleLoop{

	public static void main(String arg[]){
		
		int[] array = {1,3,4,5,2};
		
		int n = array.length;
		
		int i,j,swap;
		
		for( j=0; j<n-1; j++){
			
			if(array[j] > array[j+1]){
				
				swap = array[j];
				array[j] = array[j+1];
				array[j+1] = swap;
				j = -1;
			}		
		}
		System.out.println(array[n-2]);
	}
}