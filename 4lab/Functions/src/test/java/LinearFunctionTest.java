import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearFunctionTest {
    @Test
    public void ConstructorTest() {
        assertThrows(Exception.class, () -> new LinearFunction(0, 2, 3, 4));
        assertThrows(Exception.class, () -> new LinearFunction(1, 0, 3, 4));
        assertThrows(Exception.class, () -> new LinearFunction(1, 2, 4, 3));
    }
    @Test
    public void getValueTest() throws Exception{
        LinearFunction linearFunction = new LinearFunction(1,2,3,5);
        assertThrows(Exception.class, ()-> linearFunction.getValue(6));
        assertEquals(6, linearFunction.getValue(4));
    }
}