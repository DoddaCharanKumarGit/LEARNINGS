package getting_started;

import java.util.Scanner;

public class Q18 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number=scan.nextInt();
		int temp=number;
		int sum=0;
		for(int i=temp;i!=0;i=(int)i/10)
		{
			int r=i%10;
			sum+=r;
		}
		if(number%sum==0)
			System.out.printf("%d is a harshad number",number);
		else
			System.out.printf("%d is a harshad number",number);
	}

}
