class Solution {
    public String freqAlphabets(String s) {
        
        String ans = "";
        
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(s.charAt(i)=='#'){
                    String updated = s.charAt(i-2)+""+s.charAt(i-1);
                    
                    ans = (char)(Integer.valueOf(updated)+96) + ans;
                    
                    i=i-2;
            }else {
                // update my ans from last.
                // cast the complete expression to char. add my c+96. 
                ans = (char)(Integer.parseInt(String.valueOf(c))+96) + ans;
            }
        }

        // return the finall String ans
        return ans;
    }
}