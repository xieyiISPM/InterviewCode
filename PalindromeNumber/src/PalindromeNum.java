import java.util.Stack;

public class PalindromeNum {
    public static void main(String[] args){
        int test = 121;
        boolean result = isPalindrome2(test);
        System.out.println(result);

    }
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }


        int r = x%10;
        int q = x/10;
        long revInt = r;
        while(q != 0){
            r = q%10;
            q =  q /10;
            revInt = revInt *10 + r;
            if(revInt > Integer.MAX_VALUE){
                return false;
            }
        }
        if(revInt == x){
            return true;
        }
        else
            return false;

    }

    public static boolean isPalindrome2(int x) {
        if (x < 0){
            return false;
        }

        int r = x%10;
        int q = x/10;
        long revInt = r;
        if(q == 0){
            return true;
        }
        while(q > revInt){
            r = q%10;
            revInt = revInt *10 + r;
            q =  q /10;

        }
        if(revInt == q){
            return true;
        }
        else
            return false;

    }
}
