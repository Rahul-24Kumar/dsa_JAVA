class removeDuplicate {

    public static int removeDup (int[] arr) {

        if(arr.length == 0 ) {
            return 0;
        }

        int j =0;

        for (int i=1; i<arr.length; i++) {
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }

        return j +1;
    }

    public static void main (String [] args) {
        int[] arr = {1,1,2,2,2,3,3};

        int length = removeDup(arr);

        System.out.print("Sorted Array without Duplicatte:" + " ");
        for(int i =0; i<length; i++) {
        System.out.print(arr[i] + " ");
        }
       
    }
}