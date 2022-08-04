class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        HashSet<Character> set = new HashSet<>();
        
        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }
        
        int count = 0;
        for(int i =0;i<words.length;i++){
            String str = words[i];
            
            int j = 0;
            
            while(j<str.length() && set.contains(str.charAt(j))){
                j++;
            }
            if(j==str.length()){
                count++;
            }
        }
        return count;
    }
}