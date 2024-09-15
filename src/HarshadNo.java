import java.util.Scanner;
public class HarshadNo {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		checkSum(num);
		
	}
	public static void checkSum(int num) {
		int temp = num;
		int sum = 0;
		while(num!=0) {
			int rem = num % 10;
			sum = sum+rem ;
			num/=10;
		}
//		return sum;
		checkDivision(temp ,sum);
		
	}
	public static void checkDivision(int temp,int sum) {
		if(temp %sum ==0) {
			System.out.println(temp +" is a harshad number");
			
		}
		else {
			System.out.println(temp+" is not a harshad number");
		}
		
	}

}
