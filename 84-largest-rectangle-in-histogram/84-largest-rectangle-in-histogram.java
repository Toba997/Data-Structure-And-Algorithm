class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] pre =getPre(heights,n);
        int[] next = getNext(heights,n);
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            max = Math.max(max,(next[i]-pre[i]-1)*heights[i]);
        }
        return max;
    }
    public int [] getPre(int [] a, int n){
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[n];
        
        for(int i=0;i<n;i++){
            int curr = a[i];
            while (!st.isEmpty() && curr <= a[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.add(i);
        }
        return ans;
    }
    public int [] getNext(int[] a, int n){
        Stack<Integer> st = new Stack<>();
        
        int [] next = new int[n];
            
        for(int i=n-1;i>=0;i--){
            while (!st.isEmpty() && a[i] <= a[st.peek()]) {
                st.pop();
            }
           if(st.isEmpty()) {
                next[i] = n;
            } else {
                next[i] = st.peek();
            }
            st.push(i);
        }
        return next;
    }
}