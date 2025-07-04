class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] res=new String[str.length];
        for(String s1:str){
        int idx=Character.getNumericValue(s1.charAt(s1.length()-1))-1;
        res[idx]=s1.substring(0,s1.length()-1);
        }
        return String.join(" ",res);
    }
}