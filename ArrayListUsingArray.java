import java.util.*;

public class Arrays {
    public static void main(String[] a) {
        int[] s = new int[5];

        Scanner sc = new Scanner(System.in);
        int size = s.length;
        
        for (int i = 0; i < size; i++) {
           
            if (i == size - 1) {
                int[] temp = s.clone();

                s = new int[size + 1];
                copy(s, temp);
                size = size + 1;

            }
            s[i] = sc.nextInt();

        }
        System.out.println(size);

    }

    public static void copy(int[] n, int[] t) {
        for (int i = 0; i < t.length; i++) {
            n[i] = t[i];
        }

    }
}
