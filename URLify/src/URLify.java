import java.util.ArrayList;
import java.util.PriorityQueue;

public class URLify {
    public static void main(String[] args){
        String str = "hello wold   ";
        char[] charArray= new char[30];
        ArrayList<Character> pq = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            pq.add(str.charAt(i));
        }
        int i = 0;
        while (!pq.isEmpty()){

            Character temp = pq.remove(0);
            if(temp!= ' '){
                charArray[i] = temp;
                i++;
            }
            else{
                charArray[i] = '%';
                charArray[++i] = '2';
                charArray[++i] ='0';
                i++;
            }

        }

        System.out.println(new String(charArray));
    }
}
