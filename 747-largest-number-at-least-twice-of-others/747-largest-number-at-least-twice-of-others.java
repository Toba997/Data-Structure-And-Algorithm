class Solution {
    public int dominantIndex(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        
        for(int i:nums){
            max = Math.max(i,max);
        }
        
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max) index = i;
            
            int twice = nums[i]*2;
            
            if(twice > max && nums[i] != max) return -1;
        }
        return index;
    }
}
