import java.util.Stack;

public class CheckParentheses {
   public static void main(String[] args){
       String str = "[])";
       boolean valid = isValid2(str);
       System.out.println(valid);

   }

   public static boolean isValid2(String s){
       Stack<Character> stack = new Stack<>();
       for(char ch: s.toCharArray()){
           if(ch=='('){
               stack.push(')');
           }
           else if(ch=='['){
               stack.push(']');
           }
           else if(ch=='{'){
               stack.push('}');
           }
           else{
               if(stack.isEmpty() || ch!= stack.pop()){
                   return false;
               }
           }
       }
       if(!stack.isEmpty()){
           return false;
       }
       else{
           return true;

       }

   }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            char parentheses = s.charAt(i);
            if(parentheses == '(' || parentheses=='{'|| parentheses=='[' ){
                stack.push(parentheses);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char leftSide = stack.pop();
                if(parentheses==')' && leftSide != '('){
                    return false;
                }
                else if(parentheses==']' && leftSide != '['){
                    return false;
                }
                else if(parentheses=='}' && leftSide != '{'){
                    return false;
                }

            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }
}
