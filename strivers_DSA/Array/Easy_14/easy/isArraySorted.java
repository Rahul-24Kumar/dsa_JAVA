
class isArraySorted {

    public static boolean isSortedArray (int[] arr, int n) {

        if(n<2) {
            return true;
        }

        for (int i =1; i<n; i++) {
            if(arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main (String [] args) {
        int[] arr = {2, 3, 6, 11, 17, 18, 19};
        int n = arr.length;

        boolean value = isSortedArray(arr, n);

        if(value == true) {
            System.out.println("Array is sorted!");
        } else {
            System.out.println("Array is unsorted!");
        }
    }
}