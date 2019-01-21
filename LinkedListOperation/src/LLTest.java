public class LLTest {

    public static void main(String[] args){
        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        for(int i =10; i<= 10; i=i+10){
            Node<Integer> node = new Node<>(i);
            singleLinkedList.addNode(node);
        }
        singleLinkedList.traverseList();
        (reversedLinkedList(singleLinkedList)).traverseList();
        System.out.println("Middle element is: " + (getMiddleElement(singleLinkedList)).getData());
    }

    private static SingleLinkedList<Integer> reversedLinkedList(SingleLinkedList<Integer> singleLinkedList){
        SingleLinkedList<Integer> rll = new SingleLinkedList<>();
        Node<Integer> newHead;
        if(singleLinkedList.getHead()== null || singleLinkedList.getHead().next==null){
            return singleLinkedList;
        }
        newHead = singleLinkedList.getHead().next;
        while( newHead != null){
            Node<Integer> head = singleLinkedList.getHead();
            head.next= null;
            rll.addFirst(head);
            singleLinkedList.setHead(newHead);
            newHead = singleLinkedList.getHead().next;
        }
        rll.addFirst(singleLinkedList.getHead());
        return rll;
    }

    private static Node<Integer> getMiddleElement(SingleLinkedList<Integer> singleLinkedList){
        Node<Integer> first;
        Node<Integer> second;
        if(singleLinkedList.head == null){
            System.out.println("This is a empty LinkedList!");
            return null;
        } else if (singleLinkedList.head.next == null) {
            return singleLinkedList.getHead();
        }
        first = singleLinkedList.getHead();
        second = singleLinkedList.getHead();
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;

        }
        return first;
    }
}
