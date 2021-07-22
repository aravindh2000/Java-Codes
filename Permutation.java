import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        permutation("", "arvindh", al);
        System.out.println(al.size());

    }

    public static void permutation(String pre, String suf, ArrayList<String> ls) {
        if (suf.length() == 0) {
            ls.add(pre);
            return;
        }
        for (int i = 0; i < suf.length(); i++) {

            permutation(pre + suf.charAt(i), suf.substring(0, i) + suf.substring(i + 1, suf.length()), ls);

        }
    }
}