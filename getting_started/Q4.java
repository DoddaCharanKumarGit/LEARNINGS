package getting_started;

import java.util.Scanner;

public class Q4 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		int number1=scan.nextInt();
		int number2=scan.nextInt();
		int sum=0;
		for(int i=number1;i<=number2;i++)
			sum+=i;
		System.out.printf("sum of numbers between range (%d,%d): %d",number1,number2,sum);

	}

}
