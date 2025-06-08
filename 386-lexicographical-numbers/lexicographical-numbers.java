class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<10;i++){
          dfs(i,n,l);
        }
        return l;
    }
    private void dfs(int curr,int max,List<Integer> l){
        if(curr>max){
            return;
        }
            l.add(curr);
        
        for(int i=0;i<10;i++){
            int next=curr*10+i;
            if(next>max){
                return;
            }
            dfs(next,max,l);
            
        }
    }
}