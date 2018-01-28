import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculateMaxSumTest {
    @org.junit.jupiter.api.Test
    void calculateMaxSumPositiveNumbers() {
        assertEquals(7, StringCalculateMaxSum.calculateMaxSum(new int[]{1, 2, 4}));
    }

    @org.junit.jupiter.api.Test
    void calculateMaxSumPositiveAndNegativeNumbers() {
        assertEquals(7, StringCalculateMaxSum.calculateMaxSum(new int[]{1, 2, 4, 0, -10, -7}));
    }

    @org.junit.jupiter.api.Test
    void calculateMaxSumNegativeNumbers() {
        assertEquals(-1, StringCalculateMaxSum.calculateMaxSum(new int[]{-3, -2, -9, -1, -10, -7}));
    }
}
