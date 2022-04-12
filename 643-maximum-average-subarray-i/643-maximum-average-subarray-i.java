class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        double sum = 0;
        int j = 0;
        
        while(i<k-1){
            sum= sum+nums[i];
            i++;
        }
        
        double max = Integer.MIN_VALUE;
        double avg = 0;
        
        while(i<nums.length){
            sum = sum+nums[i];
            
            avg = sum / k;
            
            if(avg>max){
                max = avg;
            }
            
            i++;
            sum=sum-nums[j];
            j++;
        }
        return max;
    }
}