public class SquareTrinomialTwo {
    private SquareTrinomial squareTrinomial;

    public SquareTrinomialTwo(double a, double b, double c) {
        squareTrinomial = new SquareTrinomial(a, b, c);
    }

    public double getLargerRoot() throws IllegalArgumentException {
        double result;
        //перехват исключений
        try {
            double[] roots = squareTrinomial.quadratics();
            result = roots[0];
            for (double root : roots)
                result = Math.max(result, root);
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException("Корней нет!");
        }
        return result;
    }
}
