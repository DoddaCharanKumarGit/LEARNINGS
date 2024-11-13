package getting_started;

import java.util.Scanner;

public class Q11 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number=scan.nextInt();
		int product=1;
		for(int i=1;i<=number;i++)
			product*=i;
		System.out.printf("factorial of %d: %d",number,product);
	}

}
