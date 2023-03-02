package Recursion_Java;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        mergeSort(arr);
        for(int element: arr)
        {
            System.out.print(element+" ");
        }
    }
    private static void mergeSort(int arr[])
    {
        if(arr.length<=1)
        {
            return;
        }
        int mid = arr.length/2;
        int part1[] = new int[mid];
        int part2[] = new int[arr.length-mid];
        for(int i=0;i<mid;i++)
        {
            part1[i]=arr[i];
        }
        int k=0;
        for(int i=mid;i<arr.length;i++)
        {
            part2[k++]=arr[i];
        }
        mergeSort(part1);
        mergeSort(part2);
        mergeArr(arr,part1, part2);
    }
    private static void mergeArr(int []arr, int []part1, int []part2)
    {
        int i=0,j=0,k=0;
        while(i<part1.length && j<part2.length)
        {
            if(part1[i]<part2[j])
            {
               arr[k]= part1[i];
               k++;
               i++;
            }
            else
            {
               arr[k]=part2[j];
               j++;
               k++;
            }
        }
        while(i<part1.length)
        {
            arr[k]=part1[i];
            k++;
            i++;
        }
        while(j<part2.length)
        {
            arr[k]=part2[j];
            k++;
            j++;
        }
    }
}
