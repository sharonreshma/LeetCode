class Solution {
    public boolean isPalindrome(String s) {
        String ss="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                ss+=Character.toLowerCase(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder(ss);
        sb.reverse();
        if(sb.toString().equals(ss)){
            return true;
        }
return false;
    }
}