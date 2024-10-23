class Solution {
    public int lengthOfLongestSubstring(String s) {
        String res="";
        int len=0;
        int l=0;
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length();i++){
           if(!h.contains(s.charAt(i))){
                  h.add(s.charAt(i));
                 len=Math.max(len,i-l+1);  
           }
           else{
            while(h.contains(s.charAt(i))){
                h.remove(s.charAt(l));
                l++;
            }
            h.add(s.charAt(i));
        
           }
        }
        return len;
    }
}