import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int times = 3;
        rotate(a, times);
        System.out.print(Arrays.toString(a));

    }

    public static void rotate(int[] a, int times) {
        int st = 0;
        while (times > 0) {

            int temp = a[(a.length - 1)];
            for (int j = a.length - 2; j >= 0; j--) {
                a[j + 1] = a[j];
            }
            a[st] = temp;
            times--;
        }
    }
}