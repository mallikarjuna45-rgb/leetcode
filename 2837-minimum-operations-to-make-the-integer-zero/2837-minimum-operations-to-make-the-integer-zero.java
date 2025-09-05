class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int i=1;i<=60;i++){
            long val = (long)num1 - (i * (long)num2);
            if(val<0){
                return -1;
            }
            int bits = Long.bitCount(val);
            if(i>=bits && i<=val){
                return i;
            }
        }
    return -1;
    }
}