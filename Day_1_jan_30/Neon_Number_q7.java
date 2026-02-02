import java.util.Scanner;
class Neon_Number_q7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		int squre_Number=num*num;
		int sum=0;
		while (squre_Number!=0)
		{
			int temp=squre_Number%10;
			    sum=sum+temp;
				squre_Number/=10;
		}
		if (sum==num)
		{
			System.out.println("Given Number is Neon Number : ");
		}
		else
		{
			System.out.println("Given Number is not a Neon Number : ");
		}
	}
}
