public class Node<T> {
    private  T element;
    Node next = null;
    public Node(T element ){
        this.element = element;
    }

    public T getData(){
        return element;
    }
}
