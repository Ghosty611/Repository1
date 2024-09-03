package dowhile;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
		
        System.out.println("Enter the number for factorial");
		int a = s.nextInt();
		int b=a;
		int fact=1;
		
		//do 
		//{
			//fact=fact*a;
			//a--;
		//}
		while (a>0) 
		{
			fact=fact*a;
			a--;
		}
		
		System.out.println("The factorial of "+b+ " is "+fact);
		s.close();
	}
}