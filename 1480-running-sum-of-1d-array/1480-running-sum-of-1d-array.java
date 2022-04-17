class Solution {
    public int[] runningSum(int[] nums) {
        int ans [] = new int[nums.length];
        
        int temp = 0;
        int sum = 0;
        
        for(int i=0;i<nums.length;i++){
            sum = sum+temp;
            ans[i] = nums[i]+sum;;
            
            temp = nums[i];
        }
        return ans;
    }
}