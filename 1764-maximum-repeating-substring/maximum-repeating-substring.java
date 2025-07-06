class Solution {
    public int maxRepeating(String sequence, String word) {
        int c=0;
        String ss=word;
        while(sequence.contains(ss)){
            c++;
            ss+=word;
        }
        return c;
    }
}