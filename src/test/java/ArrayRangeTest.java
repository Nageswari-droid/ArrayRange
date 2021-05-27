import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayRangeTest {
    public static ArrayRange arrayRange;

    @BeforeAll
    public static void setup() {
        arrayRange = new ArrayRange();
    }

    @Test
    public void checkArrayRange() {
        int[] array = {2, 4, 1, 3, 5};
        assertEquals(4, arrayRange.findArrayRange(array, array.length));
    }
}
