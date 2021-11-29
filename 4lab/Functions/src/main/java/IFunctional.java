public interface IFunctional <T extends ISingleArgumentFunction> {
    double getValue(T function) throws Exception;
}