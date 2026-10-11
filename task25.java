public class task25 {
    public static String firstNonRepeating(String s) {
        int[] freq = new int[256];

        // Count frequencies of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return String.valueOf(s.charAt(i));
            }
        }

        return "none";
    }

    public static void main(String[] args) {
        String test1 = "swiss";
        String test2 = "aabbcc";

        System.out.println("String: \"" + test1 + "\" -> First non-repeating: " + firstNonRepeating(test1));
        System.out.println("String: \"" + test2 + "\" -> First non-repeating: " + firstNonRepeating(test2));
    }
}