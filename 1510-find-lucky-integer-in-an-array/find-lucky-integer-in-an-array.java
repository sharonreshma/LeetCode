class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int m=-1;
        for(int a:arr){
            h.put(a,h.getOrDefault(a,0)+1);
        }
        for(int k:h.keySet()){
            if(k==h.get(k)){
                m=Math.max(k,m);
            }
        }
        return m;
    }
}