class maximum_One {

    public static int findOne (int[] arr) {

        

        int currentCount =0;
        int maxOne =0;

        for(int i =0; i<arr.length; i++) {
            if(arr[i] == 1) {
                currentCount++;
                if (currentCount > maxOne) {
                    maxOne = currentCount;
                }
            }  else {
                currentCount =0;
            }
        }

        return maxOne;
    }

    public static void main(String [] args){
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(findOne(arr));
    }
}