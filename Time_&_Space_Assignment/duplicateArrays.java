package Time_Complexity_Java.Assignment_java;

public class duplicateArrays {
    public static void main(String[] args) {
        int arr[] = {0,7,2,5,4,0,1,3,6};
       // System.out.println(duplicate1(arr));
      //  duplicate2(arr);
        duplicates3(arr);
    }
    // using formula we can find the duplicates element in the array.
    static void duplicates3(int arr[])
    {
        // calculate sum of array.
        int sum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
           sum+=arr[i];
        }
        System.out.println(sum);
        int n = arr.length;
        int sumN = (n-1)*(n-2)/2;
        System.out.println(sumN);
        int res = sum - sumN;
        System.out.println(res);
    }
    // using XOR in O(N) times.
    static void duplicate2(int arr[])
    {
        int res=arr[0];
        for(int i=1;i<arr.length;i++)
        {
           res^=arr[i];
        }
        System.out.println(res);
        for(int i=0;i<arr.length-1;i++)
        {
            res^=i;
        }
        System.out.print("Duplicate is:"+res);
    }
    // brute force approach takes O(N*N) times.
    static int duplicate1(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==arr[j])
                    return arr[i];
                }
            }
        }
    return Integer.MIN_VALUE;
    }
}
