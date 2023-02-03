package Arrays_Assignment1;

public class findDuplicate {
    public static void main(String[] args) {
        int arr[] ={0,7,2,5,4,7,1,3,6};
        System.out.println(duplicateElementBest(arr));

    }
    private static int duplicateElementBest(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int n = arr.length;
        // we need to find the sum of n-2 natural numbers.
        int sumOfNaturalNum=((n-1)*(n-2))/2;
        return sum - sumOfNaturalNum;
    }
    private static int duplicateElementBetter(int arr[]){
        int ans = 0;
        for(int i=0;i<arr.length;i++)
        {
            ans^=arr[i];
        }
        for(int i=0;i<=arr.length-2;i++){
            ans^=i;
        }
        return ans;
    }
    private static int duplicateElement(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return Integer.MIN_VALUE;
    }
}
