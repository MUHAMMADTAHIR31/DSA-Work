import java.util.*;

public class DuplicationOfArray2{
	
	public static void main(String arg[]){
		
		int[] array ={1,2,1,2,3,5,5,1};
		int[] array2 ={0,0,0,0,0,0,0};
		int n = array.length;
		
		System.out.println("Array Duplicate Elements are:");
		for(int i=0; i<n; i++){
			if(array2[array[i]]== 0){
				array2[array[i]]=array[i];
			}else{
				System.out.print("\t"+ array[i]);
			}
		}
	}
}
