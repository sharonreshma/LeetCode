class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str="";
        int max=0;
        int l=0,r=0;
        HashSet<Character> h=new HashSet<>();
        while(r<s.length()){
        if(!h.contains(s.charAt(r))){
            h.add(s.charAt(r));
            max=Math.max(max,r-l+1);
            r++;
        }
      else if(h.contains(s.charAt(r))){
           
            h.remove(s.charAt(l));
           l++;
           
        }
        }
        return max;
    }
}