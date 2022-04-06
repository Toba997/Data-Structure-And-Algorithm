class Solution {
    public int removeDuplicates(int[] nums) {
        int fast = 0;
        int slow = 0;
        
        while(fast<nums.length){
            if(nums[fast]==nums[slow]){
                fast++;
            }else{
                nums[slow+1] = nums[fast];
                fast++;
                slow++;
            }
        }
        return slow+1;
    }
}