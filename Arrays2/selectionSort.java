package Arrays2_java;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 56, 8, 98,51, 5,76,8,54,23,12,11,9};
        selection(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    private static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            // initialize the minValue with ith index.
            // similiarly, minIndex with ithe index.
            int minValue = arr[i];
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++)
            {
               if(arr[j]<minValue)
               {
                 minValue=arr[j];
                 minIndex = j;
               }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
