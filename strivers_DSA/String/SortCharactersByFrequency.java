
public class SortCharactersByFrequency {

    public static String frequencySort(String s) {
        // Step 1: Count the frequency of each character
        int[] frequency = new int[128]; // Assuming ASCII characters
        for(char c : s.toCharArray()) {
            frequency[c]++;
        }

        // Step 2: Create an array of StringBuilder to act as buckets
        StringBuilder[] buckets = new StringBuilder[s.length() + 1];

        for (int i = 0; i <= s.length(); i++) {
            buckets[i] = new StringBuilder();
        }

        // Step 3: Populate the buckets with characters
        for(int i = 0; i<128; i++) {
            if(frequency[i] > 0) {
                buckets[frequency[i]].append((char)i);
            }
        }

        // Step 4: Build the result string by iterating over the buckets
        StringBuilder result = new StringBuilder();
        for(int i = s.length(); i > 0; i--) {
            if(buckets[i].length() > 0) {
                for (char c : buckets[i].toString().toCharArray()) {
                    for(int j = 0; j < i; j++) {
                        result.append(c);
                    }
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));

        String s2 = "cccaaa";
        System.out.println(frequencySort(s2));

        String s3 = "Aabb";
        System.out.println(frequencySort(s3));
    }
}