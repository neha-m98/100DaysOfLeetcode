class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int result=target-nums[i];
            if(hm.containsKey(result))
                return new int[]{hm.get(result),i};
        hm.put(nums[i],i);
        }
        return null;
    }
}