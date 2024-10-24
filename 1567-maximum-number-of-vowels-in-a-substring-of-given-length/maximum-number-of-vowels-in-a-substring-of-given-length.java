class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> h=new HashSet<>();
        h.add('a');
        h.add('e');
        h.add('i');
        h.add('o');
        h.add('u');
        int l = 0, r = 0,c=0,max=0;
        while (r < s.length()) {
         
            if (r - l + 1< k) {
                if(h.contains(s.charAt(r))){
                 c++;
                } 
                r++;
            }
            else if(r-l+1==k){
                if(h.contains(s.charAt(r))){
                 c++;
                } 
                max=Math.max(max,c);
                 if(h.contains(s.charAt(l))){
                 c--;
                } 
                r++;
                l++;

            }
 
        }

        return max;
    }
}