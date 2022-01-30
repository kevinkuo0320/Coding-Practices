public class SortedLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        ListNode temp = new ListNode(0);
        ListNode ptr3 = temp;

        while(ptr1 != null && ptr2 != null){

            if(ptr1.val <= ptr2.val){

                ptr3.next = ptr1;
                ptr1 = ptr1.next;


            } else {
                ptr3.next = ptr2;
                ptr2 = ptr2.next;
            }


            ptr3 = ptr3.next;

        }

        if(ptr1 != null) {
            ptr3.next = ptr1;
        }

        else {
            ptr3.next = ptr2;
        }

        return temp.next;




    }
}
