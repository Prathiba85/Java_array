package array;

public class Distinct_element {
public static void main(String[] args)
{
	int a[]= {10,20,30,10,20,60};
	boolean distinct = true;
	int count =0;
	for (int i=0;i<a.length;i++)
	{
		for( int j=(i-1);j>=0;j--)
		{
			
			if(a[i]==a[j])
			{
				distinct = false;
				break;
			}
		}
		if (distinct==true)
		count = count +1;
		distinct =true;
	}
	System.out.print(count);
}

}
