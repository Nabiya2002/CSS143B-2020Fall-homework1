/*
    Author: Nabiya Alam
    Version: 1.0.0
 */
public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            // optimization assuming array is already sorted
            boolean isSorted = true;

            // start second loop with element adjacent to i
            for (int j = i + 1; j < data.length; j++) {
                // compare with next element
                if (data[i] > data[j]) {
                    // swap elements
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;

                    isSorted = false;
                }
            }

            // if array is already sorted then break from loop
            if (isSorted) {
                break;
            }
        }
    }
}
