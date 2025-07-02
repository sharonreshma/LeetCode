class Solution {
    public int maxDepth(String s) {
        int c=0;
        int m=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                c++;
                if(c>m){
                    m=c;
                }
            }if(ch==')'){
                c--;
            }
        }
        return m;
    }
}