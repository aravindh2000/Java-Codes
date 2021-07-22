public class ThreeSumClosest {
    public static void main(String[] args)

    {
        int val = find(new int[] { -1, 2, 1, -4 }, 1);
        System.out.println(val);
    }

    public static int find(int[] a, int tgt) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 2; i++) {

            int high = a.length - 1;
            int low = i + 1;
            while (low < high) {
                if (a[low] + a[high] + a[i] > tgt) {
                    low++;
                    high--;
                    if (a[low] + a[high] + a[i] > max) {
                        max = a[low] + a[high] + a[i];

                    }
                }
            }
        }
        return max;
    }

}
