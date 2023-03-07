package array;

public class lessthan2 {
	
	public static void main (String [] args)
	{
		int numbers[] = {54,43,2,1,5};
		int k =6;
		
		int a[] = lessthan(numbers , k);
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static int[] lessthan(int[] numbers,int k)
{
		int j =0;
		int count = 0;
		for (int i=0;i<numbers.length;i++)
		{
			
			if ((numbers[i])<k)
			{		
				
				count = count+1;
			}
		}
	int arr[] = new int[count];
	 
	
		for(int i=0;i<numbers.length;i++ )
		{
			if ((numbers[i])<k)
			{		
				
				arr[j]=numbers[i];
				System.out.println(arr[j]);
				
			}
			
		}
	return arr;
		
}
}
