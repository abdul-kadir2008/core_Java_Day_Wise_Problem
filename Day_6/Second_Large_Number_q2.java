import java.util.Scanner;
class Second_Large_Number_q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num= Integer.parseInt(IO.readln("How many Number Input In Your List :"));
		int arr[] = new int[num];
		for (int i=0;i<num ;i++ )
		{
			arr[i]=Integer.parseInt(IO.readln("Enter Your "+(i+1)+" Number :"));
		}
		int f_Large = arr[0];
		int s_Large = arr[1];
		int temp=0;
		if (f_Large < s_Large)
		{
			temp =f_Large;
			f_Large = s_Large;
			s_Large = temp;
		}
		
		for (int i=2;i<num ;i++ )
		{
			if (arr[i]>s_Large)
			{
				s_Large=arr[i];
				if (arr[i]>f_Large)
				{
					
					s_Large=f_Large;
					f_Large=arr[i];
				}
			}
		}
	
	IO.println( "Second Large Number is : "+ s_Large);
	}
	
}
