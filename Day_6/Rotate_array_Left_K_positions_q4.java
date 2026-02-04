import java.util.Scanner;
class Rotate_array_Left_K_positions_q4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(IO.readln("How many number in Your array :"));
		int k = Integer.parseInt(IO.readln("Which Position array is Rotate "));
		int arr[]=new int[num];
		//Number input lene ke liye ...
		for (int i=0;i<num ;i++ )
		{
			arr[i]=Integer.parseInt(IO.readln("Enter Your "+(i+1)+"Number :"));
		}
		//Rotate Position se....
		for(int i=(k-1);i<num;i++)
		{
			IO.print(arr[i]);
		}
		//start Position se......
		for (int i=0;i<(k-1);i++ )
		{
			IO.print(arr[i]);
		}
	}
}
