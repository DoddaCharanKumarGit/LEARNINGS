package getting_started;

import java.util.Scanner;

public class Q15 
{
	public static Scanner scan=new Scanner(System.in);
	public static int factorial(int n)
	{
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product*=i;
		}
		return product;
	}
	public static void main(String[] args) 
	{
		int number=scan.nextInt();
		int fact=0;
		for(int i=number;i!=0;i=(int)i/10)
		{
			int r=i%10;
			fact+=factorial(r);
		}
		if(fact==number)
			System.out.printf("%d is a strong number",number);
		else
			System.out.printf("%d is not a strong number",number);

	}

}
