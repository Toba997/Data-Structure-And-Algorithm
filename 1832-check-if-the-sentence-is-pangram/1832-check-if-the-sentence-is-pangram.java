class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean arr[] = new boolean[26];
        
        int index = 0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z'){
                index = sentence.charAt(i)-'a';
            }
            arr[index]=true;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==false){
                return false;
            }
        }
        return true;
    }
}