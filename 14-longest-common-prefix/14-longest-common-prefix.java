class Solution {
    public String longestCommonPrefix(String[] strs) {
        String flow = strs[0];
        
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(flow) != 0){
                flow = flow.substring(0,flow.length()-1);
            }
        }
        return flow;
    }
}