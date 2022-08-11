class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int close = Integer.MAX_VALUE;
        int ans = 0;
        
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<=close){
                close = Math.abs(nums[i]);
                ans=nums[i];
            }
        }
        return ans;
    }
}