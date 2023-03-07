package array;

public class check_sorted {
	public static void main(String[] args)
	{
		int temp =0;
		
		int arr[] = {20,10};
		boolean flag = issorted(arr);
		if (flag==true)
			System.out.print("true");
		if (flag ==false)
			System.out.print("false");
	}
	
	public static boolean issorted (int arr[])
	{
		int temp = 0;
		for (int i=0;i<arr.length;i++)
		{
			if(temp>arr[i])
			{
				return false;
				
			}
			temp = arr[i];
		}
		return true;
		
	}

}
