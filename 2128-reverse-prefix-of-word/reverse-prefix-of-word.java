class Solution {
    public String reversePrefix(String word, char ch) {
       StringBuilder r=new StringBuilder();
       int idx=word.indexOf(ch);
       for(int i=0;i<=idx;i++){
        r.append(word.charAt(i));
       } 
       r.reverse();
       for(int i=idx+1;i<word.length();i++){
        r.append(word.charAt(i));
       }
       return r.toString();
    }
}