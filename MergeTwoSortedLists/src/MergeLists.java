public class MergeLists {
    public static void main(String[] args){
        ListNode l1 =  new ListNode(2);
        ListNode l2 = new ListNode (2);
        l1.next = l2;
        ListNode l3 = new ListNode (6);
        l2.next = l3;

        ListNode r1 =  new ListNode(1);
        ListNode r2 = new ListNode (3);
        r1.next = r2;
        ListNode r3 = new ListNode (4);
        r2.next = r3;
        ListNode r4 = new ListNode (7);
        r3.next = r4;


        //ListNode r1 =null;

        printList(mergeTwoLists(l1, r1));


    }

    private static void printList(ListNode l){
        ListNode head = l;
        while(head !=null){
            System.out.print(head.val + "-->");
            head= head.next;
        }
        System.out.println("null");
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 ==null){
            return null;
        }
        else if(l1 ==null ){
            return l2;
        }
        else if(l2== null){
            return l1;
        }
        else {
            ListNode head1 = l1;
            ListNode head2 = l2;
            ListNode newHead;
            ListNode node;

            if (head1.val > head2.val) {
                newHead = head2;
                head2 = head2.next;
            } else {
                newHead = head1;
                head1 = head1.next;
            }
            node = newHead;
            while (head1 != null && head2 != null) {
                if (head1.val > head2.val) {
                    node.next = head2;
                    head2 = head2.next;
                } else {
                    node.next = head1;
                    head1 = head1.next;
                }
                node = node.next;

            }
            if (head1 != null) {
                node.next = head1;
            } else {
                node.next = head2;
            }
            return newHead;
        }
    }
}
