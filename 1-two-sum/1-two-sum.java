class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
       
        int start = 0;
        int end = nums.length-1;
        
        int n1 = 0;
        int n2 = 0;
        
        int temp[] = new int[nums.length];
        int res [] = new int[2];
        
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(nums);
        
        while(start<end){
            int sum = nums[start]+nums[end];
            
            if(sum==target){
                n1 = nums[start];
                n2 = nums[end];
                break;
            }
            
            if(sum<target){
                start++;
            }else{
                end--;
            }
        }
        if(nums[start]!=nums[end]){
            for(int i=0;i<temp.length;i++){
                if(n1==temp[i]){
                    res[0] = i;
                }
                if(n2==temp[i]){
                    res[1] = i;
                }
            }
        }else{
            int k=0;
            for(;k<n;k++){
                if(temp[k]==nums[start]){
                    res[0]=k;
                    break;
                }
            }
                k++;
                for(;k<n;k++){
                if(temp[k]==nums[end]){
                    res[1]=k;
                    break;
                }
            }
        }
       return res;
    }
}


// 2 3 5 7 8 9 t = 14
