public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strArr = {"aca", "acba"};
        System.out.println(longestCommonPrefix(strArr));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }

        int len = strs[0].length();
        for(int i= 1; i < strs.length; i++){
            if(len > strs[i].length()){
                len = strs[i].length();
            }
        }
        String lcp = "";
        for(int i = 0; i < len; i++){
            char prefix = strs[0].charAt(i);
            boolean isCommon= true;
            for(int j= 1; j< strs.length;j++){
                if(strs[j].charAt(i) != prefix){
                    isCommon = false;
                    break;
                }
            }

            if(!isCommon ) {
                break;
            }
            else{
                lcp= lcp+prefix;
            }

        }
        return lcp;
    }
}

