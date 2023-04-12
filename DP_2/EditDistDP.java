package DP_2;

public class EditDistDP {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 ="dc";
        int m = str1.length();
        int n = str2.length();
        int[][] subProblems = new int[m+1][n+1];
        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                subProblems[i][j] = -1;
            }
        }
        System.out.println(editDist(str1,str2,subProblems));
    }
    private static int editDist(String str1, String str2,int[][]sub)
    {
        if(str1.length()==0){
            return str2.length();
        }
        if(str2.length()==0){
            return str1.length();
        }
        int m = str1.length();
        int n = str2.length();

        if(sub[m][n]!=-1){
            return sub[m][n];
        }
        if(str1.charAt(0) == str2.charAt(0)){
            int smallAns = editDist(str1.substring(1), str2.substring(1),sub);
            sub[m-1][n-1] = smallAns;
            sub[m][n] = 0+smallAns;
        }
        else
        {
            int remove = editDist(str1.substring(1), str2,sub);
            sub[m-1][n] = remove;
            int insert = editDist(str1, str2.substring(1),sub);
            sub[m][n-1] = insert;
            int substitute = editDist(str1.substring(1), str2.substring(1),sub);
            sub[m-1][n-1] = substitute;

            sub[m][n] = 1+Math.min(remove,Math.min(insert,substitute));
        }
        return sub[m][n];
    }
}
