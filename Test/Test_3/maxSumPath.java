package Test_Java.Test_3;
import java.util.*;
public class maxSumPath {
    public static void main(String[] args) {
        int ar2[] ={1,5,10,15,20,25};
        int ar1[] ={2,4,5,9,15};
        System.out.println("Saurav jha");
        maxPath(ar1,ar2);
       // System.out.println(max);
    }
    private static void maxPath(int ar1[], int ar2[])
    {
        int m = ar1.length;
        int n = ar2.length;
        int i=0,j=0;
        int result=0, sum1=0,sum2=0;

        while(i<m && j<n)
        {
            if(ar1[i]<ar2[j])
              sum1+=ar1[i++];

            else if(ar1[i]>ar2[j])
              sum2+=ar2[j++];

            else{
                result+=Math.max(sum1,sum2);
                sum1=0;
                sum2=0;

                while(i<m && j<n && ar1[i]==ar2[j])
                {
                    result = result+ar1[i++];
                    j++;
                }
            }
        }
        while(i<m)
            sum1+=ar1[i++];
    
        while(j<n)
            sum2+=ar2[j++];

        result+=Math.max(sum1,sum2);

        System.out.println(result);
    }
}
