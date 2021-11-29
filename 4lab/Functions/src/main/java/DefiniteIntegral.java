public class DefiniteIntegral implements IFunctional {
    private double a;
    private double b;

    public DefiniteIntegral(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getValue(ISingleArgumentFunction function) throws Exception {
        if (function.getStart() > a || function.getEnd() < b)
            throw new Exception("Функция за пределами отрезка");
            //левые и правые прямоугольники
        else if (b == 0)
            return (function.getValue(a / 2) * (-a));
        else if (a == 0)
            return (function.getValue(b / 2) * b);

        return function.getValue(((a + b) / 2) * (b - a));
    }
}
