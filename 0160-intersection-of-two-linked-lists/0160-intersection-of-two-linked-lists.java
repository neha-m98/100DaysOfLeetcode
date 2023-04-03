/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //get the length of both lists
        //get the diff of the length
        //traverse the long list by the diff of the length
        //now point it to currb now compare curra and currb and see if there is an intersection
        
        
        // if(headA==null || headB==null) return null;
        // ListNode a=headA;
        // ListNode b=headB;
        // while(a!=b){
        //     a=a==null?headB:a.next;
        //     b=b==null?headA:b.next;
        // }
        // return a;
        
        
        int lenA=0,lenB=0;
        ListNode currA=headA;
        ListNode currB=headB;
        while(currA!=null){
            lenA++;
            currA=currA.next;
        }
        
        while(currB!=null){
            lenB++;
            currB=currB.next;
        }
        currA=headA;
        currB=headB;
        if(lenA>lenB){
            for(int i=0;i<lenA-lenB;i++){
                currA=currA.next;
          }
        }
        else{
            for(int i=0;i<lenB-lenA;i++){
                currB=currB.next;
            }
        }
        
        while(currA!=null && currB!=null){
            if(currA==currB){
                return currA;
            }
            currA=currA.next;
            currB=currB.next;
        }
        return null;
        }
}