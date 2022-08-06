class Solution {
    public static void reverse(char[] sb, int i,int j){
        char temp = ' ';
        while(i<j){
            temp = sb[i];
            sb[i]=sb[j];
            sb[j]=temp;
            
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        
        char[] x = s.toCharArray();
        int last = 0;
        for(int i = 0; i<x.length; i++){
            if(x[i] == ' '){
                reverse(x, last, i-1);
                last = i+1;
            }
        }
        reverse(x,last,x.length-1);
        return new String(x);
    }
}