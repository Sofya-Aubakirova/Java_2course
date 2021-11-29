import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrigonometricFunctionTest {
    @Test
    public void ConstructorTest() {
        assertThrows(Exception.class, () -> new TrigonometricFunction(0, 2, 3, 4));
        assertThrows(Exception.class, () -> new TrigonometricFunction(1, 0, 3, 4));
        assertThrows(Exception.class, () -> new TrigonometricFunction(1, 2, 4, 3));
    }

    @Test
    public void getValueTest() throws Exception {
        TrigonometricFunction trigonometricFunction = new TrigonometricFunction(1, 2, 0, 5);
        assertThrows(Exception.class, () -> trigonometricFunction.getValue(7));
        assertEquals( 0.9092974268256817, trigonometricFunction.getValue(1));
    }
}