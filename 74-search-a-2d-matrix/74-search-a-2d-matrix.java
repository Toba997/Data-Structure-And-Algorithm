class Solution {
    public static boolean isSearch(int matrix[],int target){
        int start = 0;
        int end = matrix.length-1;
        
        while(start<=end){
            int mid = start+(end-start);
            
            if(matrix[mid]==target){
                return true;
            }else if(matrix[mid]>target){
                end = end-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(isSearch(matrix[i],target)==true){
                return true;
            }
        }
        return false;
    }
    
}