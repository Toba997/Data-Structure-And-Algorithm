class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max = -1;
        if(arr.length==1){
            arr[0] = -1;
            
            return arr;
        }
        
        for(int i=arr.length-1;i>=0;i--){
            int a = arr[i];
            arr[i]=max;
            max=Math.max(max,a);
        }
        return arr;
    }
}