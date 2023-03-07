package array;

public class maximum_array {
	public static void main(String[] args)
	{
		int arr[]= {100,6,10,20};
		//declaring max to Integer.MIN_Value;
		int max=Integer.MIN_VALUE;
		
		for (int i=0;i<arr.length;i++)
		{
			if (max<arr[i])
			{	
			max = arr[i];	
			
			}
		
	    }
		System.out.println(max);
		
}
}
