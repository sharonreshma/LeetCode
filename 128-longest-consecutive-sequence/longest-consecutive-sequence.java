class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int c=1;
        int max=1;
        if(arr.length==0){
            return 0;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]==arr[i-1]+1){
                c++;
            
            }
            else{
            max=Math.max(max,c);
            c=1;
            }
        }
         max=Math.max(max,c);
        return max;
    }
}