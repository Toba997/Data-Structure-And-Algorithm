class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        if(s.length()%2!=0){
            return false;
        }
        for(char ch : s.toCharArray()){    
            if(ch=='('|| ch=='{'|| ch=='['){
                st.add(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char c = st.pop();
                if((ch == ')' && c == '(') || (ch == ']' && c == '[') || (ch == '}' && c == '{'))
                    continue;
                else
                    return false;
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}