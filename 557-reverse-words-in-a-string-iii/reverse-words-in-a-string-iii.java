class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
       StringBuilder res=new StringBuilder();
       for(String strs:str){
        StringBuilder rev=new StringBuilder(strs);
        res.append(rev.reverse());
        res.append(" ");
       }
       return res.toString().trim();
    }
}