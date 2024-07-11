class leftRotate {

    public static void rotateLeftByOne (int[] arr, int n) {

        if(n<= 0) {
            return;
        }
        
        int temp = arr[0];

        for(int i =0; i<n-1; i++) {
            
           arr[i] = arr[i+1];
        }

        arr[n-1] = temp;


        for (int i =0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

    
    public static void main (String [] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;

        rotateLeftByOne(arr, n);
    }
}