public class LinearFunction implements ISingleArgumentFunction {
    //функция вида Ax+B
    private double a; //угловой коэф
    private double b;

    private double start; // начало отрезка
    private double end; // конец отрезка

    public LinearFunction(double a, double b, double start, double end) throws Exception {
        if(start >= end || a == 0 || b == 0)
            throw new Exception("Функция не опрелелена на отрезке");
        this.a = a;
        this.b = b;
        this.start = start;
        this.end = end;
    }

    @Override
    public double getStart(){
        return start;
    }

    @Override
    public double getEnd(){
        return end;
    }

    @Override
    public double getValue(double x) throws Exception {
        if(x > end || x < start) throw new Exception("Функция вышла за рамки отрезка");
        return a * x + b;
    }
}
