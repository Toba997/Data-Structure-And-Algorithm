class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        int sum = 0;
        int rem = 0;
        int subArr = 0;
        for(int num:nums){
            
            sum=sum+num;
            
            rem = sum%k;
            
            if(rem<0){
                rem=rem+k;
            }
            if(map.containsKey(rem)){
                subArr+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }else{
                map.put(rem,1);
            }
        }
        return subArr;
    }
}