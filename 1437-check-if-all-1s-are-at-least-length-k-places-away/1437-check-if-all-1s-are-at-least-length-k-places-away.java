class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++){
            int counter = 0;
            
            if(nums[i]==1 && (i+1)!=nums.length){
                i++;
                while(i<nums.length && nums[i]==0){
                    counter++;
                    i++;
                }
                i--;
                if(counter<k && i+1!=nums.length){
                    return false;
                }
                else continue;
            }
        }        
        return true;
    }
}