class Solution {
    public String reverseWords(String s) {
        
    String words[] = s.split(" ");
        String ans = "";
        for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        ans+=sb+" ";  
    } 
        return ans.trim();
    }
}