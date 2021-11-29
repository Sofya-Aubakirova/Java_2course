import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefiniteIntegralTest {
    @Test
    public void getValueTest() throws Exception {
        DefiniteIntegral definiteIntegral = new DefiniteIntegral(0, -2);
        DefiniteIntegral definiteIntegral1 = new DefiniteIntegral(-2, 2);
        DefiniteIntegral definiteIntegral2 = new DefiniteIntegral(7, 0);
        LinearFunction func = new LinearFunction(2, 4, -100, 100);
        assertThrows(Exception.class, () -> definiteIntegral.getValue(null));

        assertEquals(-4, definiteIntegral.getValue(func));
        assertEquals(4, definiteIntegral1.getValue(func));
        assertEquals(-77, definiteIntegral2.getValue(func));
    }
}