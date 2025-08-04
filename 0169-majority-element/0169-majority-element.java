class Solution {
    public int majorityElement(int[] nums) {
        int major=nums[0];
        int count=0;
        for(int num: nums){
            if(num ==major){
                count++;
            }
            else{
                count--;
                if(count==0){
                    count=1;
                    major=num;
                }
            }
        }
    return major;
    }
}