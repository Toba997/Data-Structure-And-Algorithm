class Solution {
    public boolean validMountainArray(int[] arr) {
    
        int lp = 0;
        int rp = arr.length-1;
        
        while (lp < arr.length-1 && arr[lp] < arr[lp+1]) lp++;
        while(rp>0 && arr[rp]<arr[rp-1]) rp--;
        
        if(lp>0 && rp<arr.length-1 && rp==lp){
            return true;
        }
        return false;
    }
}

