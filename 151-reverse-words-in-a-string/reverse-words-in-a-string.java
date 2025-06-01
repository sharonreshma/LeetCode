class Solution {
    public String reverseWords(String s) {
        String[] str=s.split("\\s+");
        String ss="";
        for(int i=str.length-1;i>=0;i--){
             ss+=str[i]+" ";
        }
        return ss.trim();
    }
}