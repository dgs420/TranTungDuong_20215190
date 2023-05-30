package hust.soict.dsai.lab01;
import java.util.Scanner;

public class TrianglePrint {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter height: ");
		int n = keyboard.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=(n-i);k++)
				System.out.print(" ");
			for(int j=1;j<2*i;j++)
				System.out.print("*");
			System.out.println();
			}
		
		}
}
