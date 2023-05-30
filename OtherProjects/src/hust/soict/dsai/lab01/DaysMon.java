package hust.soict.dsai.lab01;

import java.util.Scanner;

public class DaysMon {
	public static void main(String[] args) {
		int month=0,days=0,year;
		boolean check=false;
		Scanner keyboard = new Scanner(System.in);

		while(!check) {
			System.out.println("Enter month: ");
			String monthIn = keyboard.nextLine();
			
			switch(monthIn) {
			case "1","Jan","Jan.","January": 
				month = 1;
			    check = true;
			    break;
			case "2","Feb","Feb.","February":
				month = 2;
				check = true;
				break;
			case "3","Mar.","Mar","March":
				month = 3;
				check = true;
				break;
			case "4","Apr","Apr.","April":
				month = 4;
				check = true;
				break;
			case "5","May":
				month = 5;
				check = true;
				break;
			case "6","June","Jun","Jun.":
				month = 6;
				check = true;
				break;
			case "7","Jul","Jul.","July":
				month = 7;
				check = true;
				break;
			case "8","Aug","Aug.","August":
				month = 8;
				check = true;
				break;
			case "9","Sep","Sep.","September":
				month = 9;
				check = true;
				break;
			case "10","Oct","Oct.","October":
				month = 10;
				check = true;
				break;
			case "11","Nov","Nov.","November":
				month = 11;
				check = true;
				break;
			case "12","Dec","Dec.","December":
				month = 12;
				check = true;
				break;
			default:
				System.out.println("Invalid. Enter again.");
			}
		}
		
		
		System.out.println("Enter year: ");
		year = keyboard.nextInt();
		while(year<=0) {
			System.out.println("Invalid year.Enter year again: ");
			year = keyboard.nextInt();
		}
		
		switch(month) {
		     case 1,3,5,7,8,10,12:
		    	 days = 31;
		         break;
		     case 4,6,9,11:
		    	 days = 30;
		         break;
		     case 2:
		    	 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		    		 days = 29;
			     else
			    	 days = 28;
				break;
		     default: 
		    	break;
		}
		
		System.out.println("This month has "+days+" days");
	}
		
	
}
