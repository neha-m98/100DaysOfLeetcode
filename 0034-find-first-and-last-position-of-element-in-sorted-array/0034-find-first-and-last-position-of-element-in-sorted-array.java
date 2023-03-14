class Solution {
    public int[] searchRange(int[] nums, int target) {
        //follow up
        //find first occurence
        //last occurence
        //no of occurences=last-first+1
        
        int arr[]=new int[2];
        arr[0]=firstOccurence(nums,target);
        arr[1]=lastOccurence(nums,target);
        if(arr[0]==-1 || arr[1]==-1) return new int[]{-1,-1};
        return arr;
    }
        
      public int firstOccurence(int nums[],int target){
          int start=0;
          int end=nums.length-1;
          int ans=-1;
          while(start<=end){
             int mid=start+(end-start)/2;
             int midEle=nums[mid];
              if(target==nums[mid]){
                  ans=mid;
                  end=mid-1;
                  }
              else if(target<midEle){
                  end=mid-1;
              }
              else start=mid+1;
          }
          return ans;
}
        
     public int lastOccurence(int nums[],int target){
          int start=0;
          int end=nums.length-1;
          int ans=-1;
          while(start<=end){
             int mid=start+(end-start)/2;
             int midEle=nums[mid];
              if(target==nums[mid]){
                  ans=mid;
                  start=mid+1;
                  }
              else if(target<midEle){
                  end=mid-1;
              }
              else start=mid+1;
          }
          return ans;
}
       
    }
