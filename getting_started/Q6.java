package getting_started;

import java.util.Scanner;

public class Q6 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		int year=scan.nextInt();
		if(((year%4==0) && (year%100!=0))||(year%400==0))
			System.out.printf("%d is leap year",year);
		else
			System.out.printf("%d is not a leap year",year);
	}

}
