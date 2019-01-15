import java.util.HashSet;
import java.util.Map;

public class IsUnique {
    public static void main(String[] args){
        String str = new String("sos");
        HashSet<Character> charSet = new HashSet<>();
        boolean isUnique = true;
        for(int i = 0; i <  str.length(); i++){
            if(!charSet.add(str.charAt(i))){
                isUnique = false;
                break;
            }
        }
        System.out.println("Is Unique: " + isUnique);


    }
}
