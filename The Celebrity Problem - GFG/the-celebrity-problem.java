// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    public boolean knows(int M[][], int a,int b){
        if(M[a][b]==1){
            return true;
        }
        return false;
    }
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> st = new Stack<>();
    	for(int i=0;i<n;i++){
    	    st.push(i);
    	}
    	
    	while(st.size()>1){
    	    
    	    int a = st.peek();
    	    st.pop();
    	    
    	    int b = st.peek();
    	    st.pop();
    	    
    	    if(knows(M,a,b)){
    	        st.add(b);
    	    }else{
    	        st.add(a);
    	    }
    	}
    	int candidate = st.peek();
    	boolean rowCheck = false;
    	int zeroCount = 0;
    	
    	for(int i=0;i<n;i++){
    	    if(M[candidate][i]==0){
    	        zeroCount++;
    	    }
    	}
    	if(zeroCount==n){
    	    rowCheck = true;
    	}
    	boolean colCheck = false;
    	int oneCount = 0;
    	
    	for(int i=0;i<n;i++){
    	    if(M[i][candidate]==1){
    	        oneCount++;
    	    }
    	}
    	if(oneCount==n-1){
    	    colCheck=true;
    	}
    	
    	if(rowCheck==true && colCheck==true){
    	    return candidate;
    	}
    	return -1;
    }
}