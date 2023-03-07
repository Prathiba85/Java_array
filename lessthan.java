package array;

public class lessthan {
	
	public static void main (String [] args)
	{
		int numbers[] = {54,43,2,1,5};
		int k =6;
		
		lessthan(numbers , k);
		
	}
	public static int[] lessthan(int[] numbers,int k)
{
		int j =0;
		int arr[] = new int[numbers.length];
		int count = 0;
		for (int i=0;i<numbers.length;i++)
		{
			
			if ((numbers[i])<k)
			{		
				arr[j]=numbers[i];
				
				j++;
				count = count+1;
			}
		}
		int ans[] = new int[count];
		j=0;
		for(int l=0;l<count;l++ )
		{
			ans[l]=arr[j];
			System.out.println(ans[l]);
			j++;
		}
	return ans;
		
}
}
