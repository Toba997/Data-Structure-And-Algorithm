class Solution {
    public boolean halvesAreAlike(String s) {
        
        int mid = s.length()/2;
        
        String vowels = "aeiouAEIOU";
        
        int Count1=0;
        for(int i=0;i<mid;i++){
            if(vowels.indexOf(s.charAt(i)) >= 0){
                Count1++;
            }
        }
        for(int j=mid;j<s.length();j++){
            if((vowels.indexOf(s.charAt(j)) >= 0)){
                Count1--;
            }
        }
        return Count1==0;
    }
}