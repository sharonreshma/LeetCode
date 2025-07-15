class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
 return false;
        }
        int v=0;
        int c=0;
        for(char w:word.toCharArray()){
            if(Character.isLetter(w)){
                if(w=='a' || w=='e' || w=='i' || w=='o' || w=='u'
                || w=='A' || w=='E' || w=='I' || w=='O' || w=='U'){
                   v++;
                }else{
                    c++;
                }
            } else if(!Character.isDigit(w)){
     return false;
            }
        }
        if(c>0 && v>0){
            return true;
        }
        return false;
    }
}