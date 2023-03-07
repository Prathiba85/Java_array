package array;

import java.util.ArrayList;
import java.util.Iterator;

public class distinct_multi_array {
	public static void main (String[] args)
	{
		int N=4;
		//int M[][] = new int[N][N];
		int M[][] ={{2,1,4,3},{1,2,4,2},{3,1,2,4},{1,2,4,3}};
		
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
		 for(j=0;j<N;j++)
			 
		 {
			 
			 if (al.contains(M[i][j]))
			 {
				continue;
			 }
			 else
			 {
				 al.add(M[i][j]);
				 //System.out.println(al);
			 }
			 
		 }
		 i++;
	 }
	 
	 Iterator itr = al.iterator();
	 
	 while(itr.hasNext())
	 {
		 num = (int) itr.next();
		// System.out.println(num);
		 for(k=1;k<(N);k++)
				
			{
			 flag=false;
			
				for (s=0;s<(N);s++)
				{
					
					//System.out.print("vale:"+(M[k][s]));
					if(num==(M[k][s]))
					{
						flag=true;
						
					}
				}
				if(flag==true)
				{
					count_row=count_row+1;
				}
				//System.out.println("Count of row "+count_row);
				//System.out.println();
			}
			if(count_row==(N-1))	
			{
				count =count+1;
			}
			 count_row=0;
				
			//System.out.print (M[k][s]);
			//System.out.println("Totalcount"+count);
	 }
	 
	


	
	return count;
}
}
			
				