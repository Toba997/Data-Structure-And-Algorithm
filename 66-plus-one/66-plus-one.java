class Solution {
    public int[] plusOne(int[] digits) {
        int ans[]  = new int[digits.length];
        
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int [] plus = new int[digits.length+1];
        plus[0] = 1;
        
        return plus;
    }
}