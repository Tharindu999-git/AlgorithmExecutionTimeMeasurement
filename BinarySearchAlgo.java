import java.util.Arrays;

public class BinarySearchAlgo {

    public static long measure(int[] arr, int target) {
        Arrays.sort(arr);

        long start = System.nanoTime();
        Arrays.binarySearch(arr, target);
        long end = System.nanoTime();

        return end - start;
    }
}
