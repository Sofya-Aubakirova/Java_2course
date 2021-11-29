import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumFunctionalTest {

    @Test
    void getValueTest() throws Exception {
        SumFunctional test = new SumFunctional();
        LinearFunction linearFunction = new LinearFunction(2, 5, 2, 10);
        assertThrows(Exception.class, () -> test.getValue(null));
        assertEquals(51, test.getValue(linearFunction));
    }
}