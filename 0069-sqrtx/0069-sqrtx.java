class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int low = 1, high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;  // prevent overflow

            if (square <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
