import java.util.Stack;

public class QueueViaStack<E> {

    private Stack<E> stack1 = new Stack<>();
    private Stack<E> stack2 = new Stack<>();

    public QueueViaStack(){

    }

    public void enqueue(E data){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        stack2.push(stack1.pop());
    }

    public E dequeue(){
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        if(stack1.isEmpty()){
            return null;
        }
        else
            return stack1.pop();


    }

    public boolean isEmpty(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            return true;
        }
        else
            return false;
    }
}
