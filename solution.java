package array;

public class solution {
	static int distinct(int M[][], int N)
	   {
	       // code here
	       HashMap<Integer,Integer> occurrences = new HashMap<>();
	       HashSet<Integer> res = new HashSet<>();
	       for(int i = 0;i < N*N; i++){
	           int row = i/N;
	           int col = i%N;
	           int val = M[row][col]; 
	           //rows cols
	           if(row==0){
	               occurrences.put(M[row][col],row);
	           }
	           else{
	               if(occurrences.getOrDefault(M[row][col],-5)==row-1){
	                   occurrences.put(M[row][col], row);
	                   if(row==N-1)
	                       res.add(M[row][col]);
	               }
	           }

	       }
	       return res.size();

	   }

	











}
