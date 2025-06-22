class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> l=new ArrayList<>();
        for(int i=0;i<s.length();i+=k){
            int end=Math.min(i+k,s.length());
            String temp=s.substring(i,end);
            while(temp.length()<k){
                temp+=fill;
            }
            l.add(temp);
        }
        return l.toArray(new String[0]);
    }
}