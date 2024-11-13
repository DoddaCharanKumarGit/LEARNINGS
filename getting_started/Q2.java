package getting_started;

import java.util.Scanner;

public class Q2 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=scan.nextInt();
//		if((n&1)==0)
//			System.out.println("Even");
//		else
//			System.out.println("Odd");
		
		if((n^1)==n+1)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
