package forloop;

import java.util.Scanner;

public class sumofnaturalnos {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("SUM OF NATURAL NUMBERS\r");
		
		System.out.println("Enter the natural number to start from");
		int number = s.nextInt();
		int sum = number;
		
		for(int i =number; i<=1000; i++) 
		{
			sum+=i;
		}
		
		System.out.println("Sum of numbers is "+sum);
		s.close();	
	}
}