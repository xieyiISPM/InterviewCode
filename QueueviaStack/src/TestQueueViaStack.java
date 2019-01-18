public class TestQueueViaStack {
    public static void main(String[] args){
        QueueViaStack<Integer> myQueue = new QueueViaStack<>();
        for(int i = 0; i < 3; i++){
            myQueue.enqueue(i);
        }
        System.out.println("I am dequeue: " + myQueue.dequeue());
        System.out.println("I am dequeue: " + myQueue.dequeue());
        myQueue.enqueue(3);
        System.out.println("I am dequeue: " + myQueue.dequeue());
        System.out.println("I am dequeue: " + myQueue.dequeue());
       // System.out.println("I am dequeue: " + myQueue.dequeue());

        SortStack sortStack = new SortStack();
        sortStack.push(3);
        sortStack.push(4);
        sortStack.push(1);
        sortStack.push(2);
        sortStack.push(3);
        System.out.println("sortstack pop" + sortStack.pop());
        System.out.println("sortstack pop" + sortStack.pop());
        System.out.println("sortstack pop" + sortStack.pop());
        System.out.println("sortstack pop" + sortStack.pop());
        System.out.println("sortstack pop" + sortStack.pop());



    }
}
