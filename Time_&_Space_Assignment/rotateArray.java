package Time_Complexity_Java.Assignment_java;

public class rotateArray {
    public static void main(String[] args) {
        int arr[] = {2,6,3,1,5,9,8};
        rotate(arr,2);
        for(int element: arr)
        {
            System.out.print(element+" ");
        }
    }
    private static int[] rotate(int arr[], int digit)
    {
       reverseArr(arr, 0, arr.length-1);
       reverseArr(arr,0,arr.length-1-digit);
       reverseArr(arr,arr.length-digit,arr.length-1);
       return arr;
    }
    private static int[] reverseArr(int arr[], int start, int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
