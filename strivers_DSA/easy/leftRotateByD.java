
public class leftRotateByD {

    public static void reverse (int[] arr, int start, int end ) {

        while (start < end) {
           int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate (int[] arr, int k) {

      int n = arr.length;
      
      k = k % n;

      reverse(arr, 0, k-1);
      reverse(arr, k, n-1);
      reverse(arr, 0, n-1);

    }

    public static void rightRotate (int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main (String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // leftRotate(arr, 2);

        // printArr(arr);

        rightRotate(arr, 2);

        printArr(arr);
    }

    public static void printArr(int[] arr) {

        for(int i: arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}