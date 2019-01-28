import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class ReverInt {
    public static void main(String[] args){
        int num = 123;
        int revNum = reverseInt(num);
        System.out.println("Reversed number:" + revNum);
    }

    private static int reverseInt(int num){
        boolean sign= false;
        if(num < 0){
            sign = true;
            num = -num ;
        }
        int revInt = 0;
        int q = num/10;
        int r = num%10;
        revInt = r;

        while(q!=0){
            r=q%10;
            q=q/10;
            revInt = revInt *10 + r;
        }


        if(sign == true){
            revInt = -revInt;
        }
        return revInt;
    }
}
