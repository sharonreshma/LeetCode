class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> h=new HashSet<>();
        int c=0;
        int d=0;
        h.add('a');
        h.add('e');
        h.add('i');
        h.add('o');
        h.add('u');
        h.add('A');
        h.add('E');
        h.add('I');
        h.add('O');
        h.add('U');
        for(int i=0;i<s.length()/2;i++){
            if(h.contains(s.charAt(i))){
                c++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            if(h.contains(s.charAt(i))){
                d++;
            }
        }
        if(c==d){
            return true;
        }
        return false;

    }
}