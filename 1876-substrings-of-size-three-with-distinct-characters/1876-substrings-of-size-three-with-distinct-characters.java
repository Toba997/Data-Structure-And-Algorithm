class Solution {
    public int countGoodSubstrings(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            String subStr = s.substring(i, i + 3);
            for (char ch : subStr.toCharArray()) {
                set.add(ch);
            }            
            if (set.size() == 3) {
                count++;
            }
            set.clear();
        }
        return count;
    }
}