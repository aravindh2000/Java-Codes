public class Zoho {

    public static void main(String[] args) {
        System.out.println(encode("aaaabbbccc"));
    }

    static String encode(String str) {
        // Your code here

        String op = "";

        /*
         * int[] freq = new int[26]; for (int i = 0; i < str.length(); i++) {
         * 
         * freq[str.charAt(i) - 'a']++; }
         * 
         * for (int j = 0; j < freq.length; j++) { if (freq[j] != 0) {
         * 
         * op += String.valueOf((char) (j + 97)) + String.valueOf(freq[j]); } }
         */

        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) != str.charAt(i + 1)) {
                System.out.println(count);
                op += String.valueOf(str.charAt(i)) + String.valueOf(count + 1);
                count = 0;

            } else {
                count++;
            }
        }
        return op + String.valueOf(str.charAt(str.length() - 1)) + String.valueOf(count + 1);

    }

}
