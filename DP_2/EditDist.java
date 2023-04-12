package DP_2;

public class EditDist {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 ="dc";
        System.out.println(editDist(str1,str2));
    }
    private static int editDist(String str1, String str2)
    {
        if(str1.length()==0){
            return str2.length();
        }
        if(str2.length()==0){
            return str1.length();
        }
        int m = str1.length();
        int n = str2.length();

        int myAns;
        if(str1.charAt(0) == str2.charAt(0)){
            int smallAns = editDist(str1.substring(1), str2.substring(1));
            myAns = 0+smallAns;
        }
        else
        {
            int remove = editDist(str1.substring(1), str2);
            int insert = editDist(str1, str2.substring(1));
            int substitute = editDist(str1.substring(1), str2.substring(1));
            myAns = 1+Math.min(remove,Math.min(insert,substitute));
        }
        return myAns;
    }
}
