class Solution {
    public String removeOuterParentheses(String s) {
        int c=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)==')'){
            c--;
           }
           if(c!=0){
            sb.append(s.charAt(i));
           }
           if(s.charAt(i)=='('){
            c++;
           }
        }
        return sb.toString();
    }
}