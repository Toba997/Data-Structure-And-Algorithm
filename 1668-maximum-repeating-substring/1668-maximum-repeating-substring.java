class Solution {
    public int maxRepeating(String sequence, String word) {
        
        String temp = word;
        int count = 0;
            while(sequence.contains(temp)){
                temp=temp+word;
                count++;
            }
        return count;
    }
}