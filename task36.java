public class task36 {
    public static void longestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int startIdx = 0;
        int[] lastIndex = new int[256];

        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }

        int left = 0;
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            if (lastIndex[ch] >= left) {
                left = lastIndex[ch] + 1;
            }
            lastIndex[ch] = right;

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                startIdx = left;
            }
        }

        String longest = s.substring(startIdx, startIdx + maxLen);
        System.out.println("String: \"" + s + "\"");
        System.out.println("Longest substring without repeating characters: \"" + longest + "\"");
        System.out.println("Length: " + maxLen);
    }

    public static void main(String[] args) {
        longestSubstring("abcabcbb");
    }
}