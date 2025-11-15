public class LinearSearch {

    public static long measure(int[] arr, int target) {
        long start = System.nanoTime();

        for (int value : arr) {
            if (value == target) {
                break;
            }
        }

        long end = System.nanoTime();
        return end - start;
    }
}
