class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        
        while(left<right){
            int lh = height[left];
            int rh = height[right];
            int min = Math.min(lh,rh);
            
            max = Math.max(max,min*(right-left));
            
            if(lh<rh) left++;
            else right--;
        }
        return max;
    }
}