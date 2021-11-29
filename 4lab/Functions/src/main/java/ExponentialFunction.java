public class ExponentialFunction implements ISingleArgumentFunction {
    // функция вида Aexp(x) + B
    private double a;
    private double b;

    private double start;
    private double end;

    public ExponentialFunction(double a, double b, double start, double end) throws Exception {
        if (start >= end || a == 0 || b == 0) throw new Exception("Функция не опрелелена на отрезке");
        this.a = a;
        this.b = b;
        this.start = start;
        this.end = end;
    }

    @Override
    public double getStart() {
        return start;
    }

    @Override
    public double getEnd() {
        return end;
    }

    @Override
    public double getValue(double x) throws Exception {
        if (x > end || x < start) throw new Exception("Функция вышла за рамки отрезка");
        return a * Math.exp(x) + b;
    }
}