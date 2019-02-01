public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x){
        this.val = x;
    }

    public void add(int x){
        ListNode newNode = new ListNode(x);
        this.next = newNode;
    }
    public boolean hasNext(){
        if(next!= null){
            return true;
        }
        else {
            return false;
        }
    }


}
