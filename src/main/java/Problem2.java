public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i+1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}
