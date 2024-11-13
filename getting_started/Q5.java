package getting_started;

import java.util.Scanner;

public class Q5 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number1=scan.nextInt();
		int number2=scan.nextInt();
		if(number1>number2)
			System.out.printf("%d is greatest",number1);
		else
			System.out.printf("%d is greatest",number2);
		int number3=scan.nextInt();
		if(number1>number2)
		{
			if(number1>number3)
				System.out.printf("%d is greatest",number1);
			else
				System.out.printf("%d is greatest",number3);
		}
		else
		{
			if(number2>number3)
				System.out.printf("%d i greatest",number2);
			else
				System.out.printf("%d is greatest",number3);		
		}

	}

}
