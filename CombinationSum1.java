import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void main(String[] args) {

        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
        List<List<Integer>> l = new ArrayList<>();
        int target = 8;
        findCombination(l, new ArrayList<Integer>(), 0, arr, target);
        for (int i = 0; i <= l.size() - 1; i++) {
            System.out.println(l.get(i));
        }
    }

    public static void findCombination(List<List<Integer>> l, List<Integer> ds, int start, int[] arr, int target) {

        if (target == 0) {
            l.add(new ArrayList<Integer>(ds));
            return;
        }
        for (int i = start; i <= arr.length - 1; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] <= target) {

                ds.add(arr[i]);
                findCombination(l, ds, i + 1, arr, target - arr[i]);
                ds.remove(ds.size() - 1);
            }

        }

    }
}