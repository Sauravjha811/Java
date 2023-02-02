package Arrays_Problem_Java;

public class Print_Pairs {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7};
        printPairs(arr);
    }
    private static void printPairs(int[]arr){
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            System.out.print("("+arr[i]+","+arr[j]+")");
        }
      }
    }
}
