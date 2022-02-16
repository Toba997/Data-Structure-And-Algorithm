// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public static void insertSort(Stack<Integer> st,int top){
        if(st.isEmpty() || st.peek()<top){
            st.add(top);
            return;
        }
        int x = st.peek();
        st.pop();
        
        insertSort(st,top);
        st.add(x);
    }
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(!s.isEmpty()){
    
        int top = s.peek();
        s.pop();
        
        sort(s);
        
        insertSort(s,top);
		}
        return s;
	}
}