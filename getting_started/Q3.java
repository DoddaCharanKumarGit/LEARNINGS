package getting_started;

import java.util.Scanner;

public class Q3 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.printf("sum of first %d is: %d",n,sum);

	}

}
