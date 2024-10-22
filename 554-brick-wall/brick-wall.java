class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Long,Integer> map=new HashMap<>();
        int ans=0;
        for(List<Integer> row:wall){
            long sum=0;
            for(int i=0;i<row.size()-1;i++){
                sum+=row.get(i);
                ans=Math.max(ans,map.merge(sum,1,Integer::sum));
            }
        }
        return wall.size()-ans;
    }
}