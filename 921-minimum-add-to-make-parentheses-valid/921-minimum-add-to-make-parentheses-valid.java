class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        
        int res = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.isEmpty())
                   res++;
               else
                   st.pop();
           }
       }
       return res+st.size();
    }
}