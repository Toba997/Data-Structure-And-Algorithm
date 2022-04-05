class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        double res = Math.floor(n/3);
        
        List<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int i : map.keySet()){
            if(map.get(i)>res){
                list.add(i);
            }
        }
        return list;
    }
}