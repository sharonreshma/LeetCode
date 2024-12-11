class Solution {
    public String removeDuplicates(String s) {
      Stack<Character> st=new Stack<>();
      String str="";
      for(int i=0;i<s.length();i++){
        if(st.isEmpty()||st.peek()!=s.charAt(i)){
             
            st.push(s.charAt(i));
            
        }
        else{
           
            st.pop();
            
        }
       
      }
     StringBuilder sb=new StringBuilder();
     while(!st.isEmpty()){
        sb.append(st.pop());
     }
     return sb.reverse().toString();
    }
}