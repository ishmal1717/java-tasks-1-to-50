public class task18 {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        // Using frequency array for 256 ASCII characters
        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        // Verify if all frequencies are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + areAnagrams(str1, str2));
    }
}