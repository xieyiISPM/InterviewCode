import java.util.HashMap;

public class CheckPermutation {
    public static void main(String[] args){
        String str1 = new String("Hello");
        String str2 = new String("Heloo");
        HashMap<Character, Integer> strMap = new HashMap<>();
        if(str1.length() != str2.length()){
            System.out.println("Strings are not permuted!");
            System.exit(0);
        }
        else {
            for(int i =0; i< str1.length();i++){
                strMap.put(str1.charAt(i), i);
            }
            for (int i = 0; i < str2.length(); i++){
                if(!strMap.containsKey(str2.charAt(i))){
                    System.out.println("Permutation fails!");
                    System.exit(0);
                }
                strMap.remove(str2.charAt(i));
            }

            System.out.println("Is Permutation!");
        }
    }
}
