package easy;

public class DeleteDuplicatesLinkedList {

    public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next =  new ListNode(1);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    deleteDuplicates(head);
    while (head != null){
        System.out.println(head.val);
        head = head.next;
    }


    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode tempHead = head;
        ListNode prev =null;
        int prevVal =-1;
        while (tempHead != null){
            if(tempHead.val != prevVal){
                prev= tempHead;
                tempHead = tempHead.next;
                prevVal = prev.val;
            }
            else{
                tempHead = tempHead.next;
                prev.next = tempHead;
            }
        }

        return head;

    }
    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode node) {
            this.val = val;
            this.next = node;
        }
    }

}
