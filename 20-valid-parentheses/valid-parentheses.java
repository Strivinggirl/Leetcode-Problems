class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
     else if ((ch == ')' && !st.isEmpty() && st.peek() == '(') || 
                       (ch == '}' && !st.isEmpty() && st.peek() == '{') || 
                       (ch == ']' && !st.isEmpty() && st.peek() == '[')) {
                st.pop();  // Pop the matching opening bracket from the stack
            }
            else{
                 return false;
            }

        }
        return st.isEmpty();
    }
}