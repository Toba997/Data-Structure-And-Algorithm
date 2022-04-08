class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int x : map.keySet()){
            if(k>0 && map.containsKey(x+k) || k==0 && map.get(x)>1){
                count++;
            }
        }
        return count;
    }
}