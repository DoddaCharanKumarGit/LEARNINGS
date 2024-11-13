package getting_started;

import java.util.Scanner;

public class Q1 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=scan.nextInt();
		if(n==0)
			System.out.println("Zero");
		else if(n<0)
			System.out.println("Negative");
		else
			System.out.println("Positive");
	}

}
