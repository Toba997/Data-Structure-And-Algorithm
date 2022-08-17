class Solution {
    public static boolean Check(int x){
        
        int temp = x;
        while(x>0){
            int rem = x % 10;
            if(rem ==0 || temp%rem!=0){
                return false;
            }
            x=x/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(Check(i)){
                list.add(i);
            }
        }
        return list;
    }
}