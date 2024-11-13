package getting_started;

import java.util.Scanner;

public class Q12 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number=scan.nextInt();
		int power=scan.nextInt();
		System.out.printf("power of %d: %d",number,(int)Math.pow(number, power));
		System.out.println();
		
		int product=1;
		for(int i=1;i<=power;i++)
		{
			product=product*number;
		}
		System.out.printf("power of %d: %d",number,product);
	}

}
