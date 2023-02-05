package Arrays_Assignment2;

public class sort012 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 2, 0, 1 };
        sort(arr);
        for (int element : arr)
            System.out.print(element + " ");
    }

    private static void sort(int arr[]) {
        int current = 0, zeroPos = 0, twoPos = arr.length - 1;
        while (current <= twoPos) {
            if (arr[current] == 0) {
                int temp = arr[current];
                arr[current] = arr[zeroPos];
                arr[zeroPos] = temp;
                current++;
                zeroPos++;
            } else if (arr[current] == 1)
                current++;
            else {
                int temp = arr[current];
                arr[current] = arr[twoPos];
                arr[twoPos] = temp;
                twoPos--;
            }
        }
    }

}
