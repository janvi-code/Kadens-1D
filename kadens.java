import java.util.*;
import java.lang.*;
public class kadens 
{

	public static int KadensAlgo(int []arr)
	{
		int maxSoFar=arr[0];
		int maxEndingHere=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			maxEndingHere=Math.max(maxEndingHere+arr[i],arr[i]);
			maxSoFar=Math.max(maxEndingHere,maxSoFar);
		}
		
		return maxSoFar;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
			arr[i]=sc.nextInt();
		int max=kadens.KadensAlgo(arr);
		System.out.println("max="+max);
	}
}
