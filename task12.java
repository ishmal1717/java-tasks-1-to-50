public class task12 {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            // Ignore non-letter and non-digit characters on the left
            if (!Character.isLetterOrDigit(l)) {
                left++;
            }
            // Ignore non-letter and non-digit characters on the right
            else if (!Character.isLetterOrDigit(r)) {
                right--;
            }
            // Compare characters ignoring case
            else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String testStr = "A man, a plan, a canal: Panama";
        System.out.println("String: \"" + testStr + "\"");
        System.out.println("Is palindrome? " + isPalindrome(testStr));
    }
}