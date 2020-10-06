/*
    Author: Nabiya Alam
    Version: 1.0.0
 */


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        int[][] inputs = {
                {},
                {3},
                {3, 1},
                {8, 6, 4},
                {24, 43, 2, 6, 8, 7},
                {3, 3, 2, 2, 4, 4},
                {1, 2, 3, 4},
                {4, 3, 2, 1},
                {-8, -10, -2, 5}
        };

        int[][] expected = {
                {},
                {3},
                {1, 3},
                {4, 6, 8},
                {2, 6, 7, 8, 24, 43},
                {2, 2, 3, 3, 4, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {-10, -8, -2, 5}
        };
        for (int i = 0; i < inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);
            assertArrayEquals(expected[i], inputs[i]);
        }
    }
}
