package Time_Complexity_Java.Assignment_java;
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class pairSum {
    public static void main(String[] args) {
      // int arr[] = {1,3,6,2,5,4,3,2,4};
       int arr[] = {3,3,3,3,3};
      //int arr[] ={1,3,3,4,5,8,9,9,9,15};
        System.out.println(countPairSum(arr,6));
    }
    static int countPairSum(int arr[],int num)
    {
        // Sort the Array using inbuilt sort method.
        Arrays.sort(arr);
        int startIndex = 0;
        int endIndex = (arr.length-1);
        int numPair=0;

        while(startIndex<endIndex)
        {
            if(arr[startIndex]+arr[endIndex]<num)
            {
                startIndex++;
            }
            else if(arr[startIndex]+arr[endIndex]>num)
            {
                endIndex--;
            }
            else 
            {
                int elementAtStart = arr[startIndex];
                int elementAtEnd = arr[endIndex];
                // Arrays contains same elements like int arr[] = {3,3,3,3,3};
                if(elementAtStart == elementAtEnd)
                {
                    int totalElementsStartToEnd = (endIndex - startIndex)+1;
                    numPair +=(totalElementsStartToEnd *(totalElementsStartToEnd-1)/2);
                    return numPair;
                }
                int tempStartIndex = startIndex+1;
                int tempEndIndex = endIndex-1;

                while(tempStartIndex<=tempEndIndex && arr[tempStartIndex]==elementAtStart)
                {
                    tempStartIndex+=1;
                }
                while(tempEndIndex>=tempStartIndex && arr[tempEndIndex]==elementAtEnd)
                {
                    tempEndIndex-=1;
                }
                int totalElementsFromStart = (tempStartIndex - startIndex);
                int totalElementsFromEnd = (endIndex - tempEndIndex);

                numPair+=(totalElementsFromStart*totalElementsFromEnd);
                startIndex = tempStartIndex;
                endIndex = tempEndIndex;
            }
        }
       return numPair;
    }
}
