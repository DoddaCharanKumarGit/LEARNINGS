package getting_started;

import java.util.Scanner;

public class Q16 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number=scan.nextInt();
		int sum=0;
		for(int i=1;i<number;i++)
			if(number%i==0)
				sum+=i;
		
		if(sum==number)
			System.out.printf("%d is a perfect number",number);
		else
			System.out.printf("%d is not a perfect number",number);
		System.out.println();
		
		int sqrt=(int)Math.sqrt(number);
		if(sqrt*sqrt==number)
			System.out.printf("%d is a perfect square.",number);
		else
			System.out.printf("%d is not a perfect square.",number);
	}

}
