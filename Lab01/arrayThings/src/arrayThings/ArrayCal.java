package arrayThings;
import java.util.Arrays;
public class ArrayCal {

	public static void main(String[] args) {
		int[] num = {1,3,5,7};
	            
	    System.out.println("Original numeric array : "+Arrays.toString(num));
	    
	    Arrays.sort(num);
	    
	    System.out.println("\nSorted numeric array : "+Arrays.toString(num));
	    
	    int sum = 0;
	    
	    for(int i=0; i < num.length ; i++)
	    	   sum = sum + num[i];
	    
	    double avg = sum / num.length;
	    
	    System.out.println("\nAverage value of the array elements is : " + avg);
	   }
	}


