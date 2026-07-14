import java.util.Stack;
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();

        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            int top = stack.pop();
            if(temp.val != top){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}