/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode();
        ListNode last = list;

        int carry = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                while (l2 != null) {
                    int val = l2.val + carry;

                    if (val >= 10) {
                        val = val % 10;
                        carry = 1;
                    } else {
                        carry = 0;
                    }

                    ListNode node = new ListNode(val);
                    last.next = node;
                    last = node;
                    l2 = l2.next;
                }
                break;

            }
            if (l2 == null) {

                while (l1 != null) {
                    int val = l1.val + carry;

                    if (val >= 10) {
                        val = val % 10;
                        carry = 1;
                    } else {
                        carry = 0;
                    }

                    ListNode node = new ListNode(val);
                    last.next = node;
                    last = node;
                    l1 = l1.next;
                }

                break;

            }

            int val = l1.val + l2.val + carry;

            if (val >= 10) {
                val = val % 10;
                carry = 1;
            } else {
                carry = 0;
            }

            ListNode node = new ListNode(val);
            last.next = node;
            last = node;

            l1 = l1.next;
            l2 = l2.next;

        }

        if (carry == 1) {
            ListNode node = new ListNode(1);
            last.next = node;
        }

        return list.next;
    }
}