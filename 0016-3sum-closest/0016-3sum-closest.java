class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //sort array
        //keep one pointer as fixed
        ///2nd pointer at start+1
        //3rd pointer at last
        //now compare the 
     int n=nums.length;
     int minDiff=Integer.MAX_VALUE;
     Arrays.sort(nums);
     int ans=0;
     for(int i=0;i<n-2;i++){
         int low=i+1,high=n-1;
         while(low<high){
             int temp=nums[low]+nums[high]+nums[i];
             if(Math.abs(target-temp)<minDiff){
                 ans=temp;
                 minDiff=Math.abs(target-temp);
             }
             if(temp==target){
                 return target;
             }
             else if(temp>target){
                high--;
             }
             else low++;
        }
     } 
        return ans;
    }
}