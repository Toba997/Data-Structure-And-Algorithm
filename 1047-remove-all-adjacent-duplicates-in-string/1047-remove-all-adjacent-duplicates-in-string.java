class Solution {
    public String removeDuplicates(String s) {
      Stack<Character> st = new Stack<>();
      StringBuilder sb = new StringBuilder();
        
      for(char ch : s.toCharArray()){
          if(!st.isEmpty() && st.peek()==ch){
              st.pop();
          }else{
              st.add(ch);
          }
      }
      while(!st.isEmpty()){
          sb.append(st.peek());
          st.pop();
      }
       sb.reverse();
       return sb.toString();
    }
}