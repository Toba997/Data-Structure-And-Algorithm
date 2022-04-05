class Solution {
    public int findMiddleIndex(int[] nums) {
        
        if(nums.length==1){
            return 0;
        }
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        
        // left sum 
        int leftsum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum -nums[i];
            
            if(leftsum==sum) return i;
            
            leftsum = leftsum + nums[i];
        }
        return -1;
    }
}