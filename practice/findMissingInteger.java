class findMissingInteger {
    public static void main (String [] args) {
        int[] arr1 = {1, 2, 4, 7, 5, 6, 8};

        int n = arr1.length + 1; // Including the missing number
        int totalSum = (n * (n + 1)) / 2;

        // Calculate the actual sum of the array elements
        int totalArrSum = 0;
        for (int i = 0; i < arr1.length; i++) {
            totalArrSum += arr1[i];
        }

        // The missing number is the difference between the expected sum and the actual sum
        int finalNum = totalSum - totalArrSum;

        if(finalNum != 0){
            System.out.println("The missing number is: " + finalNum);
        } else {
            System.out.println("Nothing Found!");
        }
    }
}

