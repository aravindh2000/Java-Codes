import java.util.ArrayList;

import java.util.*;

public class PermutationUsingRecursion {

    public static void main(String[] args) {
        List<List<Character>> ls = new ArrayList<>();
        List<Character> l = new ArrayList<>();
        char[] arr = { 'a', 'b', 'c' };
        int[] freq = new int[25];
        for (int i = 0; i <= arr.length - 1; i++) {
            freq[arr[i] - 'a']++;

        }

        find(ls, l, freq);
        int i = 0;

        while (i < ls.size()) {
            System.out.println(ls.get(i));
            i++;

        }

        for (int j = 0; j < freq.length; j++) {
            System.out.println(freq[j]);
        }

    }

    public static void find(List<List<Character>> ls, List<Character> l, int[] freq) {
        if (l.size() == 3) {
            ls.add(new ArrayList<>(l));
            return;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                l.add((char) (freq[i] + 97));
                freq[i]--;
                find(ls, l, freq);
                l.remove(l.size() - 1);
                freq[i]++;
            }

        }

    }

}
