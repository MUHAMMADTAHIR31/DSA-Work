import java.util.*;

public class DuplicationOfArray{
	
	public static void main(String arg[]){
		
		int[] array ={1,2,1,2,3,5,5};
		int n = array.length;
		
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(array[i] == array[j]){
					System.out.print(array[j]+"\t");
				}
			}
		}
	}
}
