package Arrays_Problem_Java;

public class Basic_Of_Array {
    public static void main(String args[]) {
        // Declared Array of int datatype.
        int arr[]=new int[10];
        arr[0]=5;
        arr[5]=17;
        System.out.println(arr[0]);
        System.out.println(arr[5]);
        // cannnot access the index value less then 0 and 
        // also more than the length of the index.
        //arr[-1]=18;
        //arr[10]=15;
        // default value in the array is 0.
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        char[] cArray=new char[10];
        double[] dArray=new double[10];
        // default value of char Array is null character and double is 0.0
        System.out.println(cArray[0]);
        System.out.println(dArray[0]);
        /*arr initially refers to an array of size 5, 
        line 2 assigns 10 to arr1[1] but in line 3 arr is made to point to a new array of size 2. 
        By default all elements of integer array are initialized to 0. 
        Hence line 4 will print 0.*/
        int arr1[] = new int[5];
        arr1[1] = 10;
        arr1 = new int[2];
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
}
}
