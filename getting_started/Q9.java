package getting_started;

import java.util.Scanner;

public class Q9 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number=scan.nextInt();
		int count=0;
		for(int i=number;i!=0;i=(int)i/10)
		{
			count+=1;
		}
		int sum=0;
		int temp=number;
		for(int i=temp;i!=0;i=(int)i/10)
		{
			int r=i%10;
			sum+=(int)Math.pow(r, count);
		}
		if(number==sum)
			System.out.printf("%d is a armstrong number",number);
		else
			System.out.printf("%d is not a armstrong number",number);
		
		int number1=scan.nextInt();
		int number2=scan.nextInt();
		System.out.printf("armstrong numbers in range(%d,%d): ",number1,number2);
		for(int i=number1;i<=number2;i++)
		{
			int numtemp=i;
			int numlen=0;
			int sum1=0;
			for(int k=numtemp;k!=0;k=(int)k/10)
			{
				numlen+=1;
			}
			for(int j=numtemp;j!=0;j=(int)j/10)
			{
				int r1=j%10;
				sum1+=(int)Math.pow(r1,numlen);
			}
			if(i==sum1)
				System.out.printf("%d ",i);
		}
	}

}
