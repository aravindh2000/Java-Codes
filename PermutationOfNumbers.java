import java.util.*;

public class PermutationOfNumbers {

    public static void main(String[] args) {

        String s = "aravindh";
        char[] a = s.toCharArray();
        List<List<Character>> ls = new ArrayList<>();
        List<Character> l = new ArrayList<>();
        boolean[] freq = new boolean[a.length];
        combination(ls, l, freq, a);
        for (int j = 0; j < ls.size(); j++) {
            System.out.println(ls.get(j));
        }

    }

    public static void combination(List<List<Character>> ls, List<Character> l, boolean[] freq, char[] a) {
        if (l.size() == a.length) {
            ls.add(new ArrayList<>(l));
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (!freq[i]) {
                l.add(a[i]);
                freq[i] = true;
                combination(ls, l, freq, a);
                l.remove(l.size() - 1);
                freq[i] = false;
            }
        }

    }
}
