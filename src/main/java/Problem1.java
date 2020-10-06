/*
    Author: Nabiya Alam
    Version: 1.0.0
 */

public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {

        int left = 0;
        int right = data.length - 1;

        while (left <= right) {

            // find the middle position
            int mid = (left + right) / 2;

            // compare mid value with target
            if (data[mid] == target) {
                return mid;
            }
            // if target is greater than mid move left pointer else move right pointer
            if (target > data[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // if target not found in array return -1
        return -1; // Place holder
    }
}
