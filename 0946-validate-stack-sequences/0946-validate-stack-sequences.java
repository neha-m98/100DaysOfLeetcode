class Solution {
   public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();   
        int i = 0;  // pointer to iterate over popped[]
        for (int n : pushed) {
            stack.push(n);  // push the element to stack
            // we will keep popping and moving the i pointer until 
            // top of stack and popped[i] become unequal
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }

        // after all the operations, i pointer is supposed to go out of bounds
        // or say, we should be having all elements popped
        // means stack should be empty, i.e. we performed all operations succcesfully
        return i == popped.length;  // or stack.isEmpty()
    }
}