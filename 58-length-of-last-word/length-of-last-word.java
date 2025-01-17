class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String ss=str[str.length-1];
        int l=ss.length();
        return l;
    }
}