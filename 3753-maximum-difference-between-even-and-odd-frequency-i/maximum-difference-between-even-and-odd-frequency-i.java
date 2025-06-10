class Solution {
    public int maxDifference(String s) {
        int o=0;
        int e=s.length();
        int[] count=new int[26];
        for(char c:s.toCharArray()){
 ++count[c-'a'];
        }
        for(int freq:count){
          if(freq==0)
          continue;
          if(freq%2==0){
            e=Math.min(e,freq);
          }else{
            o=Math.max(o,freq);
          }
        }
        return o-e;
    }
}