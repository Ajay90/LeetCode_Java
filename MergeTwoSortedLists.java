/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
 */

/*
* Copyright (C) 2026 Ajay Dhage
* SPDX-License-Identifier: MIT
*/
class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Create a dummy node
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        // Compare nodes and add smaller one to result
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Add remaining nodes of non-empty list
        if(list1 != null){
            current.next = list1;
        }
        if(list2 != null){
            current.next = list2;
        }

        // Return merged list
        return dummy.next;
    }
}
