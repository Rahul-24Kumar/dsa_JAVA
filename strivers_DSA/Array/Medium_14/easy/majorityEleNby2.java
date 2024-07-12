
// Boyer-Moore Voting Algorithm

class majorityEleNby2 {

    public static int majorityElement (int[] arr) {
        
        int count =0;
        int element = 0;

        for(int num: arr) {

            if(count == 0) {

                element = num;
                count =1;
                
            } else if (element == num) {
                count++;
            } else {
                count--;
            }
        }

        int count1 =0;

        for(int num: arr) {
            if(num == element) {
                count1++;
            }
        }

            if(count1 > arr.length/2) {
                return element;
            } else {
                 return -1;
            }
    }

    public static void main (String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }
}