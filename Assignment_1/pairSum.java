package Arrays_Assignment1;

public class pairSum {
    public static void main(String[] args) {
        int arr[] = {1,3,6,2,5,4,3,2,4};
        int key=5;
        System.out.println("Total Pairs equal to the key is: "+countPairs(arr, key));

    }
    private static int countPairs(int[] arr, int key)
    {
        int numberPairs=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==key)
                {
                  numberPairs++;
                }
            }
        }
        return numberPairs;
    }

    
}
