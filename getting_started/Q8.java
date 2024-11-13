package getting_started;

import java.util.Scanner;

public class Q8 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number=scan.nextInt();
		int temp=number;
		for(int i=temp;i!=0;i=(int)i/10)
		{
			int r=i%10;
			System.out.printf("%d ",r);
		}
		System.out.println();
		temp=number;
		int sum=0;
		for(int i=temp;i!=0;i=(int)i/10)
		{
			int r=i%10;
			sum+=r;
		}
		System.out.printf("sum of all digits of %d: %d ",number,sum);
		System.out.println();
		
		temp=number;
		int rev=0;
		for(int i=temp;i!=0;i=(int)i/10)
		{
			int r=i%10;
			rev=rev+r*10;
		}
		System.out.printf("reversed number of %d: %d",number,rev);
		System.out.println();
		
		if(number==rev)
			System.out.printf("%d is a palindrome number",number);
		else
			System.out.printf("%d is not a palindrome number",number);
	}

}
