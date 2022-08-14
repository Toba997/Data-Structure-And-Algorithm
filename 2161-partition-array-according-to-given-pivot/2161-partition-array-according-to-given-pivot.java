class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int start = 0;
        int i = 0;
        int ans[] =new int[nums.length];
        int count = 0;
        
        while(start<nums.length){
            if(nums[start]<pivot){
                ans[i++] = nums[start];
            }else if(nums[start]==pivot){
                count++;
            }
            start++;
        }
        
        start = 0;
		//putting pivot values in centre (c -> count of number of pivot in array)
		for(int j = 0; j < count;  j++) {
			ans[i++] = pivot;
		}

            while(start<nums.length){
                if(nums[start]>pivot){
                    ans[i++]= nums[start];
            }
            start++;
        }
        return ans;
    }
}