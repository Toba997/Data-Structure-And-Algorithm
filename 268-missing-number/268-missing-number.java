class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num:nums){
            sum+=num;
        }
        int ans = nums.length*(nums.length+1)/2-sum;
        return ans;
    }
}
