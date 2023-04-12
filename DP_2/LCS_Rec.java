package DP_2;

public class LCS_Rec {
    public static void main(String[] args) {
        String str1 = "bedgmc";
        String str2 = "abdfglc";
        System.out.println("Longest subsequence is:-"+lLcs(str1,str2,0,0));
    }
    private static int lLcs(String str1, String str2, int i, int j)
    {
        if(i==str1.length() || j==str2.length())
        {
            return 0;
        }
        int myAns;
        if(str1.charAt(i) == str2.charAt(j))
        {
            int smallAns = lLcs(str1,str2,i+1,j+1);
            myAns = smallAns+1;
        }
        else
        {
            int ans1 = lLcs(str1,str2,i+1,j);
            int ans2 = lLcs(str1,str2,i,j+1);
            myAns = Math.max(ans1,ans2);
        }
        return myAns;
    }
}
