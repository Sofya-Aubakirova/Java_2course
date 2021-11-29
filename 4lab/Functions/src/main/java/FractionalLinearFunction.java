public class FractionalLinearFunction implements ISingleArgumentFunction {
    // функция вида (Ax + B) / (Cx + D)
    // создание обьекта класса Линейной функции тк их двк
    private LinearFunction one;
    private LinearFunction two;

    // отрезок one должен входить в отрезок two
    public FractionalLinearFunction(LinearFunction one, LinearFunction two) throws Exception {
        if ((Math.abs(one.getStart() - two.getStart()) > 0) ||
                Math.abs(one.getEnd() - two.getEnd()) > 0)
            throw new Exception("Функция выходит за рамки");

        this.one = one;
        this.two = two;
    }

    public FractionalLinearFunction(double a, double b, double c, double d, double start, double end) throws Exception {
        one = new LinearFunction(a, b, start, end);
        two = new LinearFunction(c, d, start, end);
    }


    @Override
    public double getStart() {
        return two.getStart();
    }

    @Override
    public double getEnd() {
        return two.getEnd();
    }

    @Override
    public double getValue(double x) throws Exception {
        if (two.getValue(x) <= 0) throw new Exception("Знаменатель равен нулю");
        return one.getValue(x) / two.getValue(x);
    }

}
