package Test_Java.Test_1;
import java.util.Scanner;

import Arrays_Assignment1.sort01;
public class checkAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   // check AP logic.
	   int [] arr = new int[n];
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	  System.out.println(checkIsAP(arr,n));
      //System.out.print("Check AP of Number: "+isAPorNot());
    }
    // second approach.
    static boolean checkIsAP(int [] arr, int n)
    {
        if(n==1)
        {
            return true;
        }
        int d = arr[0]-arr[1];
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]-arr[i+1]!=d)
            return false;
        }
        return true;
    }
    // first approach.
    static boolean isAPorNot(){
        Scanner sc = new Scanner(System.in);
        // takes the Number in AP from the user.
        int n = sc.nextInt();
        // two number is needed for the AP
        int prev = sc.nextInt();
        int current = sc.nextInt();
        int count=3;
        // calculate the difference of the AP Series.
        int d= current-prev;
        // prev stores the current Numbers.
        prev = current;

        while(count<=n)
        {
            current=sc.nextInt();
            // check the differce between the AP of the Next Number.
            int tempD = current-prev;
            // if tempD is not equal d, return false;
            if(tempD!=d)
            {
                return false;
            }
            count++;
            prev = current;
        }
        return true;
    }
}
