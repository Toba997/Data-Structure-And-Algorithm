class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0;i<nums.length-3;i++){
            int a = nums[i];
            
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                int b = nums[j];
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                
                int low = j+1,high=nums.length-1;
                while(low<high){
                if(a+b+nums[low]+nums[high]==target){
                    res.add(Arrays.asList(a,b,nums[low],nums[high]));
                    
                    while(low<high && nums[low]==nums[low+1]) low++;
                    while(low<high && nums[high]==nums[high-1]) high--;
                    
                    low++;
                    high--;
                    
                }else if(a+b+nums[low]+nums[high]<target){
                    low++;
                }else{
                    high--;
                }
                }
            }
        }
        return res;
    }
}