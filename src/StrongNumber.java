import java.util.Scanner;
public class StrongNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		int temp=num;
		
		int sum=0;
	    while(num>0)
		{
			int rem = num%10 ;
			
			int fact=1;
			for(int j=rem ;j>=1 ;j--)
			{
				fact=fact*j ;
				
			}
			sum= sum +fact ;
			temp/=10;
		}
		if (sum == temp)
		{
			System.out.println(temp +" is a strong number");
		}
		else
		{
			System.out.println(temp +" is not a strong number");
		}
		
		
	}
	

}
