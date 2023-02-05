package Arrays_Assignment2;

public class pushZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {2,0,0,1,3,0,0};
        pushZero(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    private static void pushZero(int arr[])
    {
        // takes two pointer one is point to current, other is point to nonZeroPos.
        int current=0, nonZeroPos=0;
        while(current<arr.length)
        {
            // current element of array is non-zero element 
            // then swap the element with nonZeroPos index's element.
            if(arr[current]!=0)
            {
                int temp = arr[current];
                arr[current]=arr[nonZeroPos];
                arr[nonZeroPos]=temp;
                nonZeroPos++;
            }
            current++;
        }
    }
}
