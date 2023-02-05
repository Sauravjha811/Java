package Arrays_Assignment2;

public class rotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2;
        rotate(arr,d);
        System.out.println("Saurav");
        for(int element:arr)
        System.out.print(element+" ");
    }
    private static void rotate(int []arr, int d)
    {
        if(arr.length==0 && arr.length==1)
        return;
        if(d>arr.length && arr.length!=0)
        d%=arr.length;
        reverseArray(arr,  0, arr.length-1);
        reverseArray(arr, 0, arr.length-d-1);
        reverseArray(arr, arr.length-d, arr.length-1);

    }
    private static void reverseArray(int arr[],int start, int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
