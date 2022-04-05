class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        
        int max = 0;
        int n = 0;
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        if(map.get(nums[i])>max){
            max=map.get(nums[i]);
            n=nums[i];
        }
        }
    return n;
    }
}