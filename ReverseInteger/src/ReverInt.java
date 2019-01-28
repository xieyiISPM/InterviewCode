import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class ReverInt {
    public static void main(String[] args){
        int num = -147483648;
        int revNum = reverse(num);
        System.out.println("Reversed number:" + revNum);
    }

    public static int reverse(int x) {
        boolean sign= false;
        if(x < 0){
            sign = true;
            if(x == Integer.MIN_VALUE){
                return 0;
            }
            x = -x ;
        }
        int q = x/10;
        int r = x%10;
        long revInt = r;

        while(q!=0){
            r=q%10;
            q=q/10;
            revInt = revInt *10 + r;
            if(revInt > Integer.MAX_VALUE){
                return 0;
            }
        }


        if(sign == true){

            revInt = -revInt;

        }
        return (int)revInt;
    }
}
