package Arrays2_java;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 56, 8, 98,51, 5,76,8,54,23,12,11,9};
        bubble(arr);
        int[] arr1 = {11,2,3,4,5,6,7,8,9};
        bubbleOptimized(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        
        }
        private static void bubbleOptimized(int[]arr1)
        {
          for(int i=0;i<arr1.length;i++)
          {
            boolean swapHappen=true;
            for(int j=0;j<arr1.length-i-1;j++)
            {
                if(arr1[j]>arr1[j+1])
                {
                   int temp=arr1[j];
                   arr1[j]=arr1[j+1];
                   arr1[j+1]=temp;
                   swapHappen=false;
                }
            }
            if(swapHappen)
            {
                return;
            }
          }
    }
        private static void bubble(int[]arr)
        {
          for(int i=0;i<arr.length;i++)
          {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
          }
    }
}
