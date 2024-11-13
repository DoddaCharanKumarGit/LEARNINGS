package getting_started;

import java.util.Scanner;

public class Q7 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int is_prime=scan.nextInt();
		int fc=0;
		for(int i=2;i<=is_prime;i++)
		{
			if(is_prime%i==0)
				fc+=1;
		}
		if(fc==1)
			System.out.printf("%d is a prime",is_prime);
		else
			System.out.printf("%d is not a prime",is_prime);
		System.out.println();
		
		int i;
		for(i=2;i<=(int)Math.sqrt(is_prime);i++)
		{
			if(is_prime%i==0)
				break;
		}
		if(i<(int)Math.sqrt(is_prime))
			System.out.printf("%d is not a prime",is_prime);
		else
			System.out.printf("%d is a prime",is_prime);
		
		int number1=scan.nextInt();
		int number2=scan.nextInt();
		int k;
		System.out.printf("prime numbers in the range(%d,%d):",number1,number2);
		for(int j=number1;j<=number2;j++)
		{
			for(k=2;k<=(int)Math.sqrt(i);k++)
			{
				if(j%k==0)
					break;
			}
			if(k>(int)Math.sqrt(i))
				System.out.printf("%d\n",j);
			
		}
	}

}
