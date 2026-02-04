import java.util.Scanner;
class Count_Digit_Or_Zero_q3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(IO.readln("Enter Your Number : "));
		int d_Count=0;
		int z_Count=0;
		while (num!=0)
		{
			 int temp=num%10;
			 if (temp==0)
			 {
				 z_Count++;
			 }
			
		d_Count++;
		num/=10;
			
		}
		IO.println("Total Digit is : "+d_Count);
		IO.println("Total Zero is : "+z_Count);
	}
}
