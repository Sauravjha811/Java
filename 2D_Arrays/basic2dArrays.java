package two_d_Arrays;

import java.util.*;

public class basic2dArrays {
    public static void main(String[] args) {
        int arr2d[][] = new int[3][4];
        // int [][] arr2d = new int[4][4];
        System.out.println(arr2d[0][1]);
        arr2d[1][1] = 18;
        System.out.println(arr2d[1][1]);
        // System.out.println(arr2d[3][1]);
        // System.out.println(arr2d[1][4]);
       // printMatrix();
       // int[] arr = {1,2,3,4};
       // System.out.println(arr.length);
      //  int [][] arr2dd = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //System.out.println(arr2dd.length);
        //System.out.println(arr2dd[0].length);
        //System.out.println(arr2d[0]);
        //System.out.println(arr2dd);
        //System.out.println(arr2d[1]);
        int input[][] = takeInput();
        printMatrix(input);
    }
    private static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        // these nested loops taking the input from the user.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the element at " + i + " row " + j + " column");
                arr[i][j] = sc.nextInt();
            }
        }
       return arr;
    }
    private static void printMatrix(int arr[][])
    {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

