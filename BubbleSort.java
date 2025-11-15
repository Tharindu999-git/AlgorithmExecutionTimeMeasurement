public class BubbleSort {

    public static long measure(int[] arr) {
        int[] a = arr.clone();

        long start = System.nanoTime();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        long end = System.nanoTime();
        return end - start;
    }
}
