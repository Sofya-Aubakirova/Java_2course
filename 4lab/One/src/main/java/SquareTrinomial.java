public class SquareTrinomial {
    private double a;
    private double b;
    private double c;

    public SquareTrinomial(double a, double b, double c) {
        double epsilon = 1e-6;
        if (Math.abs(a) <= epsilon) {
            throw new IllegalArgumentException("Не квадратный трехчлен");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] quadratics() throws IllegalArgumentException {
        double discr = (b * b) - (4 * a * c);
        if (discr < 0)
            throw new IllegalArgumentException("Дискриминант меньше нуля");
        else if (Double.compare(discr, 0) == 0)
            return new double[]{-b / (2 * a)};
        return new double[]{
                (-b - Math.sqrt(discr)) / (2 * a),
                (-b + Math.sqrt(discr)) / (2 * a)};
    }
}
