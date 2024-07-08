class moveZeroToEnd {

    public static void movingZeroInEnd (int[] arr, int n) {

        int lastNonZeroElement = 0;
        
        for (int current =0; current<n; current++) {
           if(arr[current] != 0){
            int temp = arr[lastNonZeroElement];
            arr[lastNonZeroElement] = arr[current];
            arr[current] = temp; 

            lastNonZeroElement++;
           }
           
        }

        for(int i =0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

        
    }

    public static void main (String [] args) {
        int[] arr = {0, 1, 0, 3, 0, 5, 6};

        int n = arr.length;
        movingZeroInEnd(arr, n);
    }
}