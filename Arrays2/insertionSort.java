package Arrays2_java;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 56, 8, 98,51, 5,76,8,54,23,12,11,9};
        Insertion(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    private static void Insertion(int[] arr)
    {
        // start the loops from the 1st index, because 0 index is sorted.
        for(int i=1;i<arr.length;i++)
        {
            int currentElement = arr[i];
            // it helps us to compares the current element to the last element of sorted.
            int j=i-1;

            while(j>=0 && arr[j]>currentElement)
            {
                // in these, we move the sorted array's greater element to the one index ahead.
                arr[j+1]=arr[j];
                j--;
            }
            // stores the current element.
            arr[j+1]=currentElement;
        }
    }
}
