import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PalindromePermutation {
    public static void main(String[] args){
        String sample = " tactc oa";
        HashMap<Character, Integer > charMap = new HashMap<>();
        for (int i = 0; i < sample.length(); i++){
            char c = sample.charAt(i);
            if(charMap.containsKey(c)){
                int j = charMap.get(c);
                charMap.replace(c, j, ++j);
            }
            else {
                if(c != ' ') {
                    charMap.put(c, 1);
                }
            }
        }

        Iterator it = charMap.entrySet().iterator();
        int count =0;
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            if((int)pair.getValue() % 2 != 0){
                count++;
                if(count > 1){
                    System.out.println("No, It is not permutation of palindrome.");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes, It is permutation of palindrome.");


    }
}
