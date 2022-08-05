class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
            } else
                map.put(s.charAt(i), 1);
        }
        int prev = map.get(s.charAt(0));
        for(char count: map.keySet()){
            if(map.get(count)!= prev)
                return false;
        }
        return true;
    }
}