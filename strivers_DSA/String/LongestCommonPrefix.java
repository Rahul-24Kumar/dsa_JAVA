public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }

        // Start by assuming the first string is commom prefix

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            // Reduce the prefix size until it matches the start of the current string
            while (strs[i].indexOf(prefix) !=0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Commom Prefix: " + longestCommonPrefix(strs));
    }
}