import java.io.*;
import java.util.*;
class Average
{
   public static void main(String args[])
   {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int arr[]=new int[a];
	for(int i=0;i<a;i++)
	{
		arr[i]=input.nextInt();
		System.out.println("");
	}
        int sum=arr[0];
	for(int j=1;j<a;j++)
	{
		sum=sum+arr[j];
	}
	int avg=sum/a;
	System.out.println(avg);

    }
}
