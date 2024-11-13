package getting_started;

import java.util.*;

public class Q19 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number=scan.nextInt();
		int sum=0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
				sum+=i;
		}
		if(sum>number)
			System.out.printf("%d is a abundant number",number);
		else
			System.out.printf("%d is not a abundant number",number);;

	}

}
