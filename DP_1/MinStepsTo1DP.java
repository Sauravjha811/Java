package DP_1;
import java.util.Scanner;
public class MinStepsTo1DP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countStepsMin(n));
    }
    private static int countStepsMin(int n)
    {
       if(n==1){
        return 0;
       }
       // Create an Array for the dp.
       int []minSteps = new int[n+1];
       minSteps[1] = 0;

       for(int currStep=2;currStep<=n;currStep++)
       {
        int subtractByOne = Integer.MAX_VALUE;
        int divideByTwo = Integer.MAX_VALUE;
        int divideByThree = Integer.MAX_VALUE;

        if(minSteps[currStep-1] == 0){
            subtractByOne = countStepsMin(currStep-1);
            minSteps[currStep] = subtractByOne;
        }
        else {
            subtractByOne = minSteps[currStep-1];
        }
        if(currStep%2 == 0)
        {
            if(minSteps[currStep/2] == 0){
                divideByTwo = countStepsMin(currStep/2);
                minSteps[currStep/2] = divideByTwo;
            }
            else {
                divideByTwo = minSteps[currStep/2];
            }
        }
        if(currStep%3 == 0)
        {
            if(minSteps[currStep/3] == 0){
                divideByThree = countStepsMin(currStep/3);
                minSteps[currStep/3] = divideByThree;
            }
            else {
                divideByThree = minSteps[currStep/3];
            }
        }
        minSteps[currStep] = 1+(Math.min(subtractByOne,Math.min(divideByTwo,divideByThree)));
       }
    return minSteps[n];
    }
}
