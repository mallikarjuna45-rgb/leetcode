class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; // √0 = 0, √1 = 1

        int low = 1, high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // To avoid overflow, compare mid with x / mid
            if (mid <= x / mid) {
                ans = mid;      // mid is valid
                low = mid + 1;  // go right
            } else {
                high = mid - 1; // go left
            }
        }

        return ans;
    }
}
