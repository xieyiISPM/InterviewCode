public class Node <T>{
    Node next  = null;
    T data;

    public Node(T data) {
        this.data = data;
    }

    public void add(T data){
        Node n = this;
        Node tailNode = new Node(data);
        while (n.next != null){
            n = n.next;
        }
        n.next = tailNode;

    }

    public Node addtoFirst(T data){
        Node head =this;
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
}

