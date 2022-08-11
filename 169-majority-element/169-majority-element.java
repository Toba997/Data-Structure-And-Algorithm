class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int index = 0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[index]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                index = i;
                count = 1;
            }
        }
        return nums[index];
    }
}