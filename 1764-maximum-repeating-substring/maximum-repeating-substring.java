class Solution {
    public int maxRepeating(String s, String w) {
        int c=0;
    StringBuilder sb=new StringBuilder(w);
        while(s.contains(sb)){
           c++;
           sb.append(w);
        }
        return c;
    }
}