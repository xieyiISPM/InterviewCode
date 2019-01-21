import java.util.Stack;

public class SortStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();

    public SortStack(){

    }


    public void push(Integer element){
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        else {
            while(!stack.isEmpty() && ((stack.peek()).compareTo(element) < 0)){
                tempStack.push(stack.pop());
            }
            stack.push(element);
            while(!(tempStack.isEmpty())){
                stack.push(tempStack.pop());
            }
        }
    }

    public Integer pop(){
       return  stack.pop();
    }
}
