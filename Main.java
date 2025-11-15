public class Main {

    public static void main(String[] args) {

        int[] sizes = {100, 500, 1000};

        System.out.println("=== Algorithm Performance Analyzer ===");

        // Linear Search
        System.out.println("\nAlgorithm: Linear Search");
        System.out.println("Input Size | Time (ns)");
        for (int size : sizes) {
            int[] arr = ArrayGenerator.generateArray(size);
            int target = arr[size / 2];
            long time = LinearSearch.measure(arr, target);
            System.out.println(size + " | " + time);
        }

        // Binary Search
        System.out.println("\nAlgorithm: Binary Search");
        System.out.println("Input Size | Time (ns)");
        for (int size : sizes) {
            int[] arr = ArrayGenerator.generateArray(size);
            int target = arr[size / 2];
            long time = BinarySearchAlgo.measure(arr, target);
            System.out.println(size + " | " + time);
        }

        // Bubble Sort
        System.out.println("\nAlgorithm: Bubble Sort");
        System.out.println("Input Size | Time (ns)");
        for (int size : sizes) {
            int[] arr = ArrayGenerator.generateArray(size);
            long time = BubbleSort.measure(arr);
            System.out.println(size + " | " + time);
        }

        // Quick Sort
        System.out.println("\nAlgorithm: Quick Sort");
        System.out.println("Input Size | Time (ns)");
        for (int size : sizes) {
            int[] arr = ArrayGenerator.generateArray(size);
            long time = QuickSort.measure(arr);
            System.out.println(size + " | " + time);
        }
    }
}
