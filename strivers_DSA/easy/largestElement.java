class largestElement {
    public static int largest(int n, int[] arr) {
        if (n == 0) {
            throw new IllegalArgumentException("Array is empty"); // Handle empty array case
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 8, 7, 56, 90};
        int[] arr2 = {5, 5, 5, 5};
        int[] arr3 = {10};

        System.out.println(largest(arr1.length, arr1)); // Output: 90
        System.out.println(largest(arr2.length, arr2)); // Output: 5
        System.out.println(largest(arr3.length, arr3)); // Output: 10
    }
}
