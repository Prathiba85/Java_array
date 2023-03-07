package array;
import java.util.*;
public class distinct_multi_array2 {
	public static void main (String[] args)
	{
		int N=4;
		//int M[][] = new int[N][N];
		int M[][] ={{1,2,1,2},{2,2,2,1},{2,1,2,2},{2,1,1,1}};
		
		System.out.println(distinct(M,N));			
	}


	
static int distinct(int M[][],int N)
{
	
	int num=0;
	int count=0;
	int count_row=0;
	int i=0;
	int j=0;
	int k=0;
	int s=0;
	 boolean flag=false;
	 ArrayList al = new ArrayList();
	 
	 while(i==0)
	 {
		 for(j=0;j<N-1;j++)
			 
		 {
			 
			 if (al.contains(M[i][j]))
			 {
				continue;
			 }
			 else
			 {
				 al.add(M[i][j]);
				 System.out.println(al);
			 }
			 
		 }
		 i++;
	 }
	 
	 Iterator itr = al.iterator();
	 
	 while(itr.hasNext())
	 {
		 num = (int) itr.next();
		 System.out.println(num);
	 }
	 
	return s;

}
}