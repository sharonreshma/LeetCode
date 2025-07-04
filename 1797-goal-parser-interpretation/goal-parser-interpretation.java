class Solution {
    public String interpret(String command) {
        String s=command.replace("()","o");
        String h=s.replace("(al)","al");
        return h;
    }
}