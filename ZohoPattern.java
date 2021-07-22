public class ZohoPattern {

    public static void main(String[] args) {
        char[] a = "geeksforgeeks".toCharArray();
        int start = 0;
        int end = a.length - 1;
        char[][] val = new char[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    val[i][j] = a[i];
                }
                if (i == start && j == end) {
                    val[i][j] = a[end];
                    start++;
                    end--;
                }

            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (val[i][j] != '\u0000') {
                    System.out.print(val[i][j]);
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

}
