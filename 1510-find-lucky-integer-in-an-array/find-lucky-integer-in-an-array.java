class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        int m=-1;
        for(int key:h.keySet()){
            if(key==h.get(key)){
                m= Math.max(m,key);

            }
        }
        return m;
    }
}