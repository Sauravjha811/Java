package Arrays_Assignment1;

import javax.lang.model.util.ElementScanner6;

public class sort01 {
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0,1};
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int [] arr)
    {
        int startIndex = 0;
        int lastIndex = arr.length-1;
        int i=0;
        while(startIndex <= lastIndex)
        {
            if(arr[startIndex]==0)
            {
               startIndex++;
            }
            else if(arr[lastIndex]==1)
            {
                lastIndex--;
            }
            else {
                int temp = arr[startIndex];
                arr[startIndex]=arr[lastIndex];
                arr[lastIndex]=temp;
            }

        }

        
    }
}
