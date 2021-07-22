import java.util.ArrayList;
import java.util.List;

public class Coin {

    public static void main(String[] args) {
        ArrayList<List<Integer>> ds = new ArrayList<>();

        sum(1, 3, new ArrayList<>(), ds);

        for (int i = 0; i < ds.size(); i++) {
            System.out.println(ds.get(i));
        }

    }

    public static void sum(int start, int sum, List<Integer> ls, ArrayList<List<Integer>> ds) {
        int limit = 3;
        if (sum == 0) {
            ds.add(new ArrayList<>(ls));
            return;
        }
        for (int i = 1; i <= limit; i++) {
            if (i <= sum) {
                ls.add(i);
                sum(1, sum - i, ls, ds);
                ls.remove(ls.size() - 1);

            }
        }
    }

}
