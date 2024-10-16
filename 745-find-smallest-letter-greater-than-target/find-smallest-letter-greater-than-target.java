class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        if(target>=letters[letters.length-1]){
            return letters[0];
        }
        int s=0;
        int l=letters.length-1;
        while(s<=l){
            int mid=s+(l-s)/2;
            if(letters[mid]<=target){
             s=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        return letters[s];
    }
}