class Solution {
    public int maximum69Number (int num) {
        String numString = String.valueOf(num);
        boolean find = false;
        StringBuilder str = new StringBuilder();
        for(char ch : numString.toCharArray()){
            if(ch=='6' && !find){
                str.append('9');
                find = true;
            }
            else
            str.append(ch);
        }
        return Integer.valueOf(str.toString());
    }
}