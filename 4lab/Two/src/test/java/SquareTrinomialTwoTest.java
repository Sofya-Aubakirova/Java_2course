import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTrinomialTwoTest {
    @Test
    public void checkSquareTrinomialTwo() {
        SquareTrinomialTwo squareTrinomialTwo = new SquareTrinomialTwo(3, 13, -10);
        SquareTrinomialTwo squareTrinomialTwo1 = new SquareTrinomialTwo(1, -2, 1);
        assertEquals(2 / 3., squareTrinomialTwo.getLargerRoot());
        assertEquals(1, squareTrinomialTwo1.getLargerRoot());
    }

    @Test
    public void checkingForExceptions() {
        //SquareTrinomialTwo squareTrinomialTwo = new SquareTrinomialTwo(1,2,3);
        assertThrows(IllegalArgumentException.class, () -> new SquareTrinomialTwo(1, 2, 3).getLargerRoot());
    }
}