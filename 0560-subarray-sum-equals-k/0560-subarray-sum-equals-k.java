class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int prefSum=0;
       int count=0;
       for(int i=0;i<nums.length;i++){
                prefSum+=nums[i];
                if(prefSum == k){
                    count++;
                }
                    int remaining = prefSum-k;
                    if(map.containsKey(remaining)){
                        count = count + map.get(remaining);
                    }
                map.put(prefSum,map.getOrDefault(prefSum,0)+1);
       }
    return count;
    }
}