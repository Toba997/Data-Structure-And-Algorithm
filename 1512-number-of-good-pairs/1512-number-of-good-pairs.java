class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int count = 0;
        for(int i : map.keySet()){
            int k = map.get(i);
            
            count = count + k*(k-1)/2;
        }
        return count;
    }
}