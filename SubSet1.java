public class SubSet1 {

    public static void main(String[] args) {

        int[] arr = { 3, 2 };
        findSum(arr, 0, 0);

    }

    public static void findSum(int[] arr, int start, int sum) {
        for (int i = start; i <= arr.length - 1; i++) {
            sum += arr[i];
            if (arr[i] < arr[i + 1]) {
                System.out.print(sum + " ");
            }
            findSum(arr, i + 1, sum - arr[i]);
        }

    }
}
