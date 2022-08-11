class Solution {
    public static void swap(int []nums, int start, int end){
        int temp = nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int index = 0;index<nums.length;index++){
            if(nums[index]!=index+1){
                list.add(index+1);
            }
        }
        return list;
    }
}