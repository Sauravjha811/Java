package Arrays_Assignment1;

public class tripletSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int key=12;
        System.out.println(countTriplet(arr,key));
    }
    private static int countTriplet(int arr[], int key)
    {
        int numberTriplet=0;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==key)
                    {
                        numberTriplet++;
                    }
                }
            }
        }
        return numberTriplet;
    }
}
