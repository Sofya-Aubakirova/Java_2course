public class SumFunctional implements IFunctional {
    @Override
    public double getValue(ISingleArgumentFunction function) throws Exception {
        if (function == null) {
            throw new Exception("Функции нет");
        }
        return function.getValue(function.getStart()) + function.getValue(function.getEnd()) +
                function.getValue((function.getEnd() + function.getStart()) / 2);
    }

}