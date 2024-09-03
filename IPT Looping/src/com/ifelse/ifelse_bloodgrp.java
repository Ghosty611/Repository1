package com.ifelse;

import java.util.Scanner;

public class ifelse_bloodgrp {

	public static void main(String[] args) {
		
		System.out.println("BLOOD GROUP DETERMINER\r");
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the RBC antigen below");
		String antigen = s.next();
		
		System.out.println("Enter the antibodies in plasma below");
		String antibody = s.next();
		
		System.out.println("Enter the RhD antigen below");
		String RhD = s.next();
		
		if(antigen.equals("A")&antibody.equals("Anti-B")) 
		{
			if (RhD.equals("present"))
			{
				System.out.println("The Blood type is A+");
			}
			else
			{
				System.out.println("The Blood type is A-");
			}
		}
		else if(antigen.equals("B")&antibody.equals("Anti-A"))
		{
			if (RhD.equals("present"))
			{
				System.out.println("The Blood type is B+");
			}
			else
			{
				System.out.println("The Blood type is B-");
			}
		}
		else if(antibody.equals("Anti-A&Anti-B"))
		{
			if (RhD.equals("present"))
			{
				System.out.println("The Blood type is O+");
			}
			else
			{
				System.out.println("The Blood type is O-");
			}
		}
		else if(antigen.equals("A&B"))
		{
			if (RhD.equals("present"))
			{
				System.out.println("The Blood type is AB+");
			}
			else
			{
				System.out.println("The Blood type is AB-");
			}
		}
		else
		{
			System.out.println("Wrong Blood Details Entered.Try Again!!");
		}
		s.close();
	}
}