import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTrinomialTest {
    @Test
    public void checkSquareTrinomial() {
        SquareTrinomial squareTrinomial = new SquareTrinomial(3, 13, -10);
        SquareTrinomial squareTrinomial1 = new SquareTrinomial(1, -2, 1);
        //SquareTrinomial squareTrinomial2 = new SquareTrinomial(1,2,3);
        assertArrayEquals(new double[]{-5., 2 / 3.}, squareTrinomial.quadratics());
        assertArrayEquals(new double[]{1., 1.}, squareTrinomial1.quadratics());
        assertThrows(IllegalArgumentException.class, () -> new SquareTrinomial(1, 2, 3).quadratics());
    }

    @Test
    public void checkingForExceptions() {
        assertThrows(IllegalArgumentException.class, () -> new SquareTrinomial(0, 2, 3));

    }
}