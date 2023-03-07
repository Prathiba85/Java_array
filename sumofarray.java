package array;

public class sumofarray {
	public static void main(String[] args)
	{
		int arr[]= {92,2,74,55,0,10,-60,24,91,-67,11};
		//declaring max to Integer.MIN_Value;
		double sum=0;
		int count =0;
		
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]>=0)
	        {
	           sum =sum + arr[i];
	           System.out.println(sum);
	           count = count+1;
	        }
			
				
	    }
		
		double avg =(sum/count);
		System.out.println(avg);
		
}
}
