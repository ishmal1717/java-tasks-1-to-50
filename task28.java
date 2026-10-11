public class task28 {
    // Compression method
    public static String compress(String s) {
        if (s == null || s.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    // Decompression method
    public static String decompress(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            char ch = s.charAt(i);
            int count = Character.getNumericValue(s.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String original = "aaabbc";
        String compressed = compress(original);
        String decompressed = decompress(compressed);

        System.out.println("Original: " + original);
        System.out.println("Compressed: " + compressed);
        System.out.println("Decompressed: " + decompressed);
    }
}