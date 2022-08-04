class Solution {
    public String sortSentence(String s) {
        String [] words = s.split(" ");
        String [] bucket = new String[words.length];
        for(String word : words){
            int value = Character.getNumericValue(word.charAt(word.length()-1))-1;
            
            bucket[value] = word.substring(0,word.length()-1);
        }
        
        return String.join(" ",bucket);
    }
}