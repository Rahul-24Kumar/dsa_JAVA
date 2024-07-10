

class appearedOnced {

    public static int getSingleNum (int[] arr) {

       int xor =0;

       for (int num : arr) {
        xor = xor ^ num;
       }

       return xor;

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 3, 4, 5, 2, 1};

        int num = getSingleNum(arr);

        System.out.println(num);
    }
}