class Solution {
    public int[] productExceptSelf(int[] nums) {
        //keep left and multiply the ones on the right
        //keep right and multiply the ones with the left
        //element at i-1*number to get the muplied value
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        
        left[0]=1;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        
        right[nums.length-1]=1;
        for(int i=nums.length-2;i>-1;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=left[i]*right[i];
        }
        return result;
    }
}