package hust.soict.dsai.lab01;
import java.util.Arrays;
public class ArrayCal {

	public static void main(String[] args) {
		int[] num = {9,3,5,7};
	            
	    System.out.println("Original numeric array : "+Arrays.toString(num));
	    
	    for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
                }
            }
        }
	    
	    System.out.println("\nSorted numeric array : "+Arrays.toString(num));
	    
	    int sum = 0;
	    
	    for(int i=0; i < num.length ; i++)
	    	   sum = sum + num[i];
	    
	    double avg = sum / num.length;
	    
	    System.out.println("\nSum of the array elements is : " + sum);
	    System.out.println("Average value of the array elements is : " + avg);
	   }
	}


