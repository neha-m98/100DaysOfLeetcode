class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     // create a stack and an array
     //add the last element of any array into stack, if empty then put -1 in array, if greater found put the peek element in the array or else pop up the element from the stack and get the next greater element
        
        if(nums2.length==0 || nums1.length==0)
            return new int[0];
        
        Map<Integer,Integer> numbersMap=new HashMap<>();
        Stack<Integer> numStack=new Stack<>();
        
        //create the map and add the length
        //key is the first parameter and the value is the second in map
        numbersMap.put(nums2[nums2.length-1],-1);
        numStack.push(nums2[nums2.length-1]);
        
        //start from 2nd last bcoz for last the element the next graeter is already found
        for(int i=nums2.length-2;i>=0;i--){
            if(nums2[i]<numStack.peek()){
                numbersMap.put(nums2[i],numStack.peek());
                numStack.push(nums2[i]);
                continue;
            }
            
            
            //after popping
            while(!numStack.isEmpty() && numStack.peek()<nums2[i])
                numStack.pop();
            
            // if it is empty, then check if empty do 
            if(numStack.isEmpty()){
              numbersMap.put(nums2[i],-1);
              numStack.push(nums2[i]);  
            }
            
            //else add the the element
            else {
             numbersMap.put(nums2[i], numStack.peek());
             numStack.push(nums2[i]);
           }
        
    }
            
             for (int i = 0; i < nums1.length; i++)
             nums1[i] = numbersMap.get(nums1[i]);

            return nums1;

    }
}