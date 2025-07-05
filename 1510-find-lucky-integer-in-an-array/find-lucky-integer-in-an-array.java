class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int a:arr){
            h.put(a,h.getOrDefault(a,0)+1);
        }
        int m=-1;
        for(int key:h.keySet()){
            if(key==h.get(key)){
          m=Math.max(m,key);
            }
        }
        return m;
    }
}