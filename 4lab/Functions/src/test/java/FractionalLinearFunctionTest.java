import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionalLinearFunctionTest {
    @Test
    public void ConstructorTest() {
        assertThrows(Exception.class, () -> new FractionalLinearFunction(new LinearFunction(1, 2, 0, 8), new LinearFunction(2, 12, 1, 11)));
        assertThrows(Exception.class, () -> new FractionalLinearFunction(1, 2, 3, 4, 6, 5));
    }
   @Test
    public void getValueTest() throws Exception {
       FractionalLinearFunction fractionalLinearFunction = new FractionalLinearFunction(new LinearFunction(2, 5, 0, 10),
               new LinearFunction(1,2 ,0, 10));
       assertThrows(Exception.class, ()-> fractionalLinearFunction.getValue(-2));
       assertEquals(2.25,fractionalLinearFunction.getValue(2));
   }
}