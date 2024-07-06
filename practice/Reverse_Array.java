class Reverse_Array {
    public static void main (String [] args) {
        int [] elements = {3, 7, 9, 1, 5, 8, 0};

        reverseElement(elements);

        System.out.print("Reversed Array : ");

        for (int i : elements){
            System.out.print(i + " ");
        }

    }

       public static void reverseElement(int [] array) {

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];

            array[left] = array[right];

            array[right] = temp;

            left++;
            right--;
        }
       }
    }