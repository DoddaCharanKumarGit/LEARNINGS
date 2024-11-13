package getting_started;

import java.util.Scanner;

public class Q17 
{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number=scan.nextInt();
		int square=number*number;
		int temp=number;
		int count=0;
		for(int i=temp;i!=0;i=(int)i/10)
		{
			count+=1;
		}
//		System.out.println(count);
		temp=number;
		int count2=0;
		int iter=0;
		while(iter<count)
		{
			int r1=temp%10;
			int r2=square%10;
			if(r1==r2)
				count2+=1;
			temp=(int)temp/10;
			square=(int)square/10;
			iter+=1;
		}
		if(count==count2)
			System.out.printf("%d is a automorphic number",number);
		else
			System.out.printf("%d is not a automorphic number",number);
			

	}

}
