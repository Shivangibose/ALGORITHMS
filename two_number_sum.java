
/*
 Two number sum

     write a function that takes in a non-empty array of distinct integers representing a target sum,if sum of any
     two number in the input array equal to the target sum, the function in array should be in sorted order.
     If no two number sum up to the target sum,the function should return an empty array.Assume that there 
     will be at most one pair of numbers summing up to give the target sum.

     Sample input-[3,5,-4,8,11,1,-1,6]10
     Sample output-[-1,11]
 */

//TIME COMPLEXITY
import java.util.ArrayList;
public class two_number_sum 
{
	public static void main(String[] args) 
	{
		int a[]={3,5,-4,8,11,1,-1,6};
		int b[]=new int[2];
		int target=10;
		ArrayList<Integer> store=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
		    int temp=target-a[i];
		    if(store.contains(temp)){
		        System.out.println("["+temp+","+(target-temp)+"]");
		    }
		    
		    else {
		        store.add(a[i]);
		    }
		}
	}
}




//SPACE COMPLEXITY
//import java.util.Arrays;
//public class two_number_sum 
//{
//	public static void main(String[] args) 
//	{
//		int a[]={3,5,-4,8,11,1,-1,6};
//		int b[]=new int[2];
//		int target=10;
//		Arrays.sort(a);
//		int left=0;
//		int right=a.length-1;
//		while(left<right)
//		{
//		if((a[left]+a[right])==target)
//		{
//			b[0]=a[left];
//			b[1]=a[right];
//			break;
//		}
//		if((a[left]+a[right])>target)
//		{
//			right--;
//		}
//		if((a[left]+a[right])<target)
//		{
//			left++;
//		}
//		}
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.print(b[i]+" ");
//		}
//		
//	}
//}

//NORMAL
//public class two_number_sum 
//{
//	public static void main(String[] args) 
//	{
//		int a[]= {3,5,-4,8,11,1,-1,6};
//		int b[]=new int[2];
//		int target=10;
//		for(int x=0;x<a.length;x++)
//		{
//			for(int j=x+1;j<a.length;j++)
//			{
//					if((a[x]+a[j])==target)
//					{
//						b[0]=a[x];
//						b[1]=a[j];
//						break;
//					}	
//			}
//		}
//		for(int i=0;i<b.length;i++)
//		{
//		System.out.print(b[i]+" ");
//		}
//
//	}
//
//}
