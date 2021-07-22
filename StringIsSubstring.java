public class StringIsSubstring {

    public static void main(String[] args) {
        char[] a1 = "test123string".toCharArray();
        char[] a2 = "123".toCharArray();
        int st = 0, begin = 0;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == a2[st]) {
                st++;
                begin = i;
                // System.out.println("found in index : " + i);

            }
        }
        /*
         * System.out.println(st); System.out.println(begin); if (st == a2.length) { for
         * (int i = 1; i <= st; i++) { begin--;
         * 
         * } System.out.println(begin + 1); } else { System.out.println(-1); }
         */

    }

}
