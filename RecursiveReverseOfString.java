public class RecursiveReverseOfString {
    public static void main(String[] args) {
        String st = reverse("", "I love india", "I love india".length() - 1);
        System.out.println(st);
    }

    public static String reverse(String st, String or, int end) {
        if (st.length() == or.length()) {
            System.out.println(st);
            return st;
        }
        System.out.println("entry");
        return reverse(st + or.charAt(end--), or, end);

    }
}