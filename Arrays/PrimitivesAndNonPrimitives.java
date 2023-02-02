package Arrays_Problem_Java;

public class PrimitivesAndNonPrimitives {
    public static void increment(int i){
        // increase the value of local copy i, because of
        // primitive data types.
        i++;
    }
    public static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
   /*public static void incrementArray(int[] arr){
    // increase the arr values, because of Non-primitive data 
    // in which referenced are passed as the arguments.
       for(int i=0;i<arr.length;i++){
           arr[i]=arr[i]+1;
       }
   }*/
   public static int[] incrementArray(int[] input){
    // System.out.println(input);
     input=new int[5];
     for(int i=0;i<input.length;i++){
         input[i]=input[i]+1;
     }
     return input;
 }
public static void main(String args[]) {
     int i=10;
     increment(i);
     System.out.println(i);
     int[] arr={1,2,3,4,5};
     arr=incrementArray(arr);
     printArray(arr);
    }
}

