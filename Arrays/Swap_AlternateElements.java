package Arrays_Problem_Java;

public class Swap_AlternateElements {
    public static void main(String[] args) {
        int arr[] = {9,3,6,12,4,32};
        swapElement(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void swapElement(int arr[]){
        for(int i=0;i<arr.length-1;i+=2){
           int temp = arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;
        }
    }
}
