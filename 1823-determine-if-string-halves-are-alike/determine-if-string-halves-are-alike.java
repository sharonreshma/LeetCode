class Solution {
    public boolean halvesAreAlike(String s) {
        int c=0,m=0;
        for(int i=0;i<s.length()/2;i++){
        if((s.charAt(i)=='a')|| (s.charAt(i)=='e')||(s.charAt(i)=='i')||
        (s.charAt(i)=='o')||(s.charAt(i)=='u'||s.charAt(i)=='A')|| 
        (s.charAt(i)=='E')||(s.charAt(i)=='I')||
        (s.charAt(i)=='O')||(s.charAt(i)=='U')){
       c++;
        }
        }
        for(int i=s.length()/2;i<s.length();i++){
if((s.charAt(i)=='a')|| (s.charAt(i)=='e')||(s.charAt(i)=='i')||
        (s.charAt(i)=='o')||(s.charAt(i)=='u'||s.charAt(i)=='A')|| 
        (s.charAt(i)=='E')||(s.charAt(i)=='I')||
        (s.charAt(i)=='O')||(s.charAt(i)=='U')){
       c--;
        }
        }
        if(c==0){
            return true;
        }
        return false;
    }
}