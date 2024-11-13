package getting_started;

import java.util.Scanner;

public class Q13 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number=scan.nextInt();
		System.out.printf("Factors of %d:",number);
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
				System.out.printf("%d ",i);
		}
	}

}
