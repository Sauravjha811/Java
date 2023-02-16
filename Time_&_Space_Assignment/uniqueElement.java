package Time_Complexity_Java.Assignment_java;

public class uniqueElement {
    public static void main(String[] args) {
        int arr1[]={2,3,1,1,8,6,3,6,2};
        uniqueElement1(arr1);
        System.out.println(uniqueElement2(arr1));
    }
    // Using XOR we can find unique in O(n) times.
    static int uniqueElement2(int arr[])
    {
        int res=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            res^=arr[i];
        }
        return res;
    }
    // Approach 1st takes O(N*N) times
    static void uniqueElement1(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            boolean flag = true;
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                continue;
                if(arr[i]==arr[j])
                flag = false;
            }
            if(flag)
            {
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
