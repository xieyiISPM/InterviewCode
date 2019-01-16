public class EditDistance {
    public static void main(String[] args){
        String a = "helfdsfdsf";
        String b = "hel";

        int ed = editDistance(a, b);
        System.out.println("Edit distance is:" + ed);

    }

    private static int  editDistance(String a, String b){
        int m  = a.length() + 1;
        int n = b.length() + 1;
        int [][] matrix = new int[m][n];
        for (int i = 0; i< m; i++){
            matrix[i][0] = i;
        }
        for(int j=0; j< n; j++){
            matrix[0][j]= j;
        }

        int del = 1;
        int insert = 1;
        int rep = 0;
        for (int i = 1; i< m; i++){
            for(int j = 1; j< n; j++){
                if(a.charAt(i-1) != b.charAt(j-1)){
                    rep = 1;
                }
                matrix[i][j] = min(matrix[i-1][j] + del, matrix[i][j-1]+ insert, matrix[i-1][j-1] + rep);
            }
        }
        return matrix[m-1][n-1];
    }

    private static int min(int num1, int  num2, int num3){
        int min;
        if(num1 > num2 ){
            min = num2;
        }
        else {
            min = num1;
        }
        if(min > num3){
            min = num3;
        }
        return min;
    }
}
