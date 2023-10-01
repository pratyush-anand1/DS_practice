class Solution {
    public String reverseWords(String s) {
        Stack<Character> st = new Stack<>();
        String str = "";
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
             while(!st.isEmpty()) {
                 char c = st.pop();
                 str += c;

             }
             str += " ";
            } else {
                st.push(ch);
            }
        }
        return str;
    }
}
