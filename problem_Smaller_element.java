package array;

import java.util.ArrayList;
import java.util.Arrays;

public class problem_Smaller_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList<>(Arrays.asList(100,20,40,60,80,200));
		
		System.out.println(getSmaller(arr,50));

	}
	
	public static ArrayList<Integer> getSmaller(ArrayList<Integer>arr,int k)
	{
		ArrayList arr1= new ArrayList();
		
		for(int a:arr)
		{
			if(a<k)
			{
				arr1.add(a);
			}
		}
		
		return arr1;
		
	}

}
