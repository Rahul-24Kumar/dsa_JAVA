import java.util.ArrayList;
import java.util.List;

class unionOfSortedArr {

    public static int[] union (int[] arr1, int[] arr2) {

        int i=0, j=0;
        List<Integer> resultList = new ArrayList<>();

        while (i<arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                if(resultList.isEmpty() || resultList.get(resultList.size()-1) !=arr1[i]) {
                    resultList.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if(resultList.isEmpty() || resultList.get(resultList.size()-1) !=arr2[j]) {
                    resultList.add(arr2[j]);
                }
                j++;
            } else {
                if(resultList.isEmpty() || resultList.get(resultList.size()-1) !=arr1[i]) {
                    resultList.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while(i<arr1.length) {
            if(resultList.isEmpty() || resultList.get(resultList.size()-1) != arr1[i]){
                resultList.add(arr1[i]);
            }
            i++;
        }

        while (j<arr2.length) {
            if(resultList.isEmpty() || resultList.get(resultList.size() -1) != arr2[j]) {
                resultList.add(arr2[j]);
            }
            j++;
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        int[] unionArray = union(arr1, arr2);

        for(int num: unionArray) {
            System.out.print(num + " ");
        }
    }
}