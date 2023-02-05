package Arrays_Assignment2;

public class checkArrayRotation {
    public static void main(String[] args) {
        int [] arr = {5,6,7,1,2,3,4};
        System.out.println("Array rotates: "+checkRotation(arr));
    }
    private static int checkRotation(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return i+1;
            }
        }
        return -1;
    }
}
