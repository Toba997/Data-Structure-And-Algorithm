class Solution {
    public String convertToTitle(int columnNumber) {
    int n = columnNumber;
    String res = "";
    while(n != 0) {
        char ch = (char)((n - 1) % 26 + 'A');
        n = (n - 1) / 26;
        res = ch + res;
    }
    return res;
        
    }
}