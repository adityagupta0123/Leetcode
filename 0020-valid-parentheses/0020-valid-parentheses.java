class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        for(int i=0; i< s.length(); i++){
            char x = s.charAt(i);
            
            if(st.empty() || x == '(' || x == '{' || x == '['){
                st.push(x);
                
            } 
            else {
                if ( (x == ')' && st.peek() != '(') || 
                    (x == '}' && st.peek() != '{')  || 
                    (x == ']' && st.peek() != '[') ) {
                    
                    return false ;
                }
                st.pop();
            }
        }
        return st.empty();        
    }
}