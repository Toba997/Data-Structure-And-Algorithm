class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        char ch;
        for(int i=0;i<s.length;i++){
            ch = s[i];
            stack.add(s[i]);
        }
        
        int j = 0;
        while(!stack.isEmpty()){
            s[j] = stack.pop();
            j++;
        }
    }
}