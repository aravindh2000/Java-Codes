public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "abbacdaabbaadac";
        int max = Integer.MIN_VALUE;
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s.substring(i, j + 1))) {
                    int current = (j - i) + 1;
                    if (current >= max) {
                        max = current;
                        start = i;
                        end = j;
                    }
                }
            }

        }
        System.out.println("Max length is " + max + " and value is " + s.substring(start, end + 1));
    }

    public static boolean isPalindrome(String str) {
        int end = str.length() - 1;
        int start = 0;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

}
