import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPermutationsTest {
    @org.junit.jupiter.api.Test
    void permutation() {
        assertEquals("ABC ACB BAC BCA CAB CBA", StringPermutations.permutation("ABC"));
    }

}
