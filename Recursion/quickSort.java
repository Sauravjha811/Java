package Recursion_Java;

//import javax.lang.model.util.ElementScanner6;

public class quickSort {
    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        sort( arr, 0, arr.length-1);
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
    }
    private static void sort(int arr[], int startIndex, int endIndex)
    {
        if(startIndex>=endIndex)
        {
            return;
        }
        int pivotPos = partition(arr, startIndex, endIndex);
        sort(arr,startIndex, pivotPos-1);
        sort(arr,pivotPos+1, endIndex);
    }
    private static int partition(int arr[], int startIndex, int endIndex)
    {
        int pivot = arr[startIndex];
        int count=0;
        for(int i=startIndex+1;i<=endIndex;i++)
        {
            if(arr[i]<=pivot)
            {
                count++;
            }
        }
        int pivotPos = startIndex+count;
        int temp = arr[startIndex];
        arr[startIndex] = arr[pivotPos];
        arr[pivotPos] = temp;

        int i=startIndex;
        int j=endIndex;
        while(i<pivotPos && j>pivotPos)
        {
            if(arr[i]<=arr[pivotPos])
            {
                i++;
            }
            else if(arr[j]>=arr[pivotPos])
            {
                j--;
            }
            else {
                int temp1 = arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
                i++;
                j--;
            }
        }
        return pivotPos;
    }
}
