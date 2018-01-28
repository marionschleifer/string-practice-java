import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPermutationsTest {
    @org.junit.jupiter.api.Test
    void permutation() {
        String[] arr = new String[]{"ABC", "ACB", "BAC", "BCA", "CAB", "CBA" };
        assertArrayEquals(arr, StringPermutations.permutation("ABC"));
    }

}