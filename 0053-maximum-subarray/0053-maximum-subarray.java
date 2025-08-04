class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=0;
        int maxSum=nums[0];
        for(int num:nums){
            currentSum=Math.max(num,currentSum+num);
            maxSum=Math.max(currentSum,maxSum);
        }
    return maxSum;
    }
}