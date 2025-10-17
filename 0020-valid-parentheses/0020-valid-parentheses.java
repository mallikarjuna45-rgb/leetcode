class Solution {
    public boolean isValid(String s) {
        String opemimg ="({[";
        Stack<Character> st = new Stack<>();
        for(Character c : s.toCharArray()){
            if(opemimg.indexOf(c)!=-1){
                st.add(c);
            
            }
            else{
                if(st.isEmpty() || opemimg.indexOf(st.peek()) != ")}]".indexOf(c)){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
    return st.isEmpty();
    }
}