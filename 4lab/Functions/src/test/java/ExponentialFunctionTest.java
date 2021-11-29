import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentialFunctionTest {
    @Test
    public void ConstructorTest() {
        assertThrows(Exception.class, () -> new TrigonometricFunction(0, 2, 3, 4));
        assertThrows(Exception.class, () -> new TrigonometricFunction(1, 0, 3, 4));
        assertThrows(Exception.class, () -> new TrigonometricFunction(1, 2, 4, 3));

    }
    @Test
    public void getValueTest() throws Exception {
            ExponentialFunction exponentialFunction = new ExponentialFunction(1, 1, -100, 100);
            assertThrows(Exception.class, () -> exponentialFunction.getValue(-101));
            assertEquals(1, exponentialFunction.getValue(-100));
    }
}