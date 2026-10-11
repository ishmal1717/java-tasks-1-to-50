public class task10 {
    public static void main(String[] args) {
        String str = "Java Programming 8.0!";
        int vowels = 0, consonants = 0, digits = 0, others = 0;

        str = str.toLowerCase();

        // Single loop to process every character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                others++;
            }
        }

        System.out.println("Input String: \"" + str + "\"");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Other characters (spaces/symbols): " + others);
    }
}