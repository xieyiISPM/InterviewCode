import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args){

        String roman= "MVI";
        int result = romanToInt2(roman);
        System.out.println(result);

    }

    public static int romanToInt(String s) {
        HashMap<Character,Integer> numSet =  new HashMap<>();
        numSet.put('I',1);
        numSet.put('V',5);
        numSet.put('X', 10);
        numSet.put('L', 50);
        numSet.put('C', 100);
        numSet.put('D', 500);
        numSet.put('M', 1000);
        HashMap<String, Integer> specialSet = new HashMap<>();
        specialSet.put("IV", 4);
        specialSet.put("IX", 9);
        specialSet.put("XL", 40);
        specialSet.put("XC", 90);
        specialSet.put("CD", 400);
        specialSet.put("CM", 900);
        if(s.length()==1){
            return numSet.get(s.charAt(0));
        }
        else {
            char current ;
            char next ;
            String special;
            int result = 0;
            int i = 0;

            for (; i < s.length() - 1; i++) {
                current = s.charAt(i);
                next = s.charAt(i + 1);
                special = "" + current + next;
                if (specialSet.containsKey(special)) {
                    result = result + specialSet.get(special);
                    i++;
                } else {
                    result = result + numSet.get(current) ;

                }
            }
            if(i == s.length()-1 ){
                result = result + numSet.get(s.charAt(i));
            }

            return result;
        }
    }

    public static int romanToInt2(String s) {
        HashMap<Character,Integer> numSet =  new HashMap<>();
        numSet.put('I',1);
        numSet.put('V',5);
        numSet.put('X', 10);
        numSet.put('L', 50);
        numSet.put('C', 100);
        numSet.put('D', 500);
        numSet.put('M', 1000);

        if(s.length()==1){
            return numSet.get(s.charAt(0));
        }
        else {
            char current ;
            char next ;
            String special;
            int result = 0;
            int i = 0;
            int currentNum ;
            int nextNum;

            for (; i < s.length() - 1; i++) {
                current = s.charAt(i);
                next = s.charAt(i + 1);
                currentNum = numSet.get(current);
                nextNum = numSet.get(next);

                if (next != 'I' && currentNum < nextNum)  {
                    result = result + nextNum - currentNum;
                    i++;
                } else {
                    result = result + currentNum ;

                }
            }
            if(i == s.length()-1 ){
                result = result + numSet.get(s.charAt(i));
            }

            return result;
        }
    }
}
