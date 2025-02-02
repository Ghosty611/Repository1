package dowhile;

import java.util.Scanner;

public class reversenumber {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number to be reversed below ");
		int num = s.nextInt();
		
		int revnum = 0;

		while (num != 0)
		{
			int i = num%10;                                 // modulus gives the last number reminder which is i
			revnum = (revnum*10) + i;                       // multiply the reversed number by 10 plus i to construct number
			num=num/10;                                     // divide by 10 to proceed for next loop
		}
		
		System.out.println("The reversed number is "+revnum);
		s.close();
	}
}