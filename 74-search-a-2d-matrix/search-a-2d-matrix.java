class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        if(r==0){
            return false;
        }
        int c=matrix[0].length;
        int s=0;
        int e=r*c-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int element=matrix[mid/matrix[0].length][mid%matrix[0].length];
            if(element==target){
                return true;
            }
            if(element<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return false;
    }
}