class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s=strs[0];
        String l=strs[strs.length-1];
        int i=0;
        while(i<s.length() && i<l.length()){
            if(s.charAt(i)==l.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return s.substring(0,i);
    }
}