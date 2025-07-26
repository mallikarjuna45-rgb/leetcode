class Solution {
    public double myPow(double x, int n) {
        double sum = 1;
        long temp = n;  // Use long to avoid overflow when n = Integer.MIN_VALUE
        if (temp < 0) {
            temp = -temp;
            x = 1 / x;  // Invert x for negative exponents
        }
        
        while (temp != 0) {
            if (temp % 2 == 1) {
                sum = sum * x;
            }
            x = x * x;
            temp = temp / 2;
        }
        
        return sum;
    }
}
