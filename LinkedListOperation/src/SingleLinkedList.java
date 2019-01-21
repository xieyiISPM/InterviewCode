public class SingleLinkedList<T> {

    Node<T> head;

    public SingleLinkedList(){
        this.head = null;
    }

    public void addNode(Node node){
        Node curr = head;
        if(head == null){
            head = node;
            return;
        }
        while(curr.next!= null){
            curr = curr.next;
        }
        curr.next = node;
    }

    public void traverseList(){
        Node curr = head;
        if(head == null){
            System.out.println("LinkedList is empty!");
        }
        while(curr.next != null){
            System.out.print(curr.getData()+ " --> ");
            curr = curr.next;
        }
        System.out.println(curr.getData()+" --> null");
    }

    public Node getHead(){
        return head;
    }

    public void setHead(Node node){
        this.head = node;
    }

    public void addFirst(Node node){
        if(head == null){
            head = node;
        }
        else{
            node.next =  head;
            head = node;
        }
    }
}
