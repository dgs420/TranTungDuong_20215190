package hust.soict.dsai.lab01;
import java.util.Scanner;
public class TwoSix {
	public static void main(String[] args) {
		 Scanner keyboard = new Scanner(System.in);

	        int choice;
	        do {
	        	System.out.println();
	            System.out.println("1. Solve first-degree equation with one variable");
	            System.out.println("2. Solve system of first-degree equations with two variables");
	            System.out.println("3. Solve second-degree equation with one variable");
	            System.out.println("4. Exit");

	            System.out.println("\nChoose one: ");
	            choice = keyboard.nextInt();

	            switch (choice) {
	                case 1:
	                    int a, b;
	                    System.out.println("a*x+b=0\n");
	                    do {
	                    System.out.println("Enter a");
	                    a = keyboard.nextInt();
	                    }while(a==0);
	                    System.out.println("Enter b: ");
	                    b = keyboard.nextInt();
	                    
	                    	System.out.println("x = " + (double) -b /a);
	                    
	                    break;
	                case 2:
	                    System.out.println("a11*x1 + a12*x2 = b1");
	                    System.out.println("a21*x1 + a22*x2 = b2\n");
	                    
	                    System.out.println("Enter a11 a12 b1: ");
	                    int a11 = keyboard.nextInt();
	                    int a12 = keyboard.nextInt();
	                    int b1 = keyboard.nextInt();
	                    
	                    System.out.println("Enter a21 a22 b2: ");
	                    int a21 = keyboard.nextInt();
	                    int a22 = keyboard.nextInt();
	                    int b2 = keyboard.nextInt();
	                    
	                    int D = a11 * a22 - a12 * a21;
	                    int D1 = b1 * a22 - b2 * a12;
	                    int D2 = a11 * b2 - a21 * b1;
	                    
	                    if (D!=0) 
	                    	System.out.println("\nx1 = " + (double)D1 / D + "\nx2 = " + (double)D2 / D);
	                    
	                    else {
	                    	if ((D1==0)&&(D2==0)) 
	                    		System.out.println("Infinite solutions");
	                    	else 
	                    		System.out.println("No solution");
	                    	}
	                    
	                    break;
	                case 3:
	                    System.out.println("a*x^2 + b*x + c = 0\n");
	                    do {
	                    	System.out.println("Enter a: ");
	                        a = keyboard.nextInt();
	                    } while (a==0);
	                    System.out.println("Enter b: ");
	                    b = keyboard.nextInt();
	                    System.out.println("Enter c: ");
	                    int c = keyboard.nextInt();
	                    
	                    int delta = b*b - 4*a*c;
	                    if (delta < 0) {
	                    	System.out.println("\nNo root");
	                    }
	                    else if (delta == 0) {
	                    	System.out.println("\nDouble root x = " + (double)-b / (2*a));
	                    }
	                    else {
	                    	System.out.println("\nx1 = " +  (double)((-b + Math.sqrt(delta)) / (2*a)));
	                    	System.out.println("x2 = " + (double)((-b - Math.sqrt(delta)) / (2*a)));
	                    }
	                    
	                    break;
	                case 4:
	                    System.out.println("You have exit");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Choose again.\n");
	            }
	        } while (choice!=4);
	        
	        //System.exit(0);
	}
}
