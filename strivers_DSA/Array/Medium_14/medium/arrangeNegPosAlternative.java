
class arrangeNegPosAlternative {

    public static int[] rearrange(int[] arr) {
        
        int n = arr.length;
        int i =0;
        int j = 1;

        while (i<n  && j<n) {

            while (i<n && arr[i] >=0) {
                i+=2;
            }

            while (j<n && arr[j] < 0) {
                j+=2;
            }

            if(i<n && j<n) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return arr;
    }

        public static void main (String[] args) {

            int[] arr = {3, -1, -4, -6, 2, 5, -7, 8, 0};
            rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
}