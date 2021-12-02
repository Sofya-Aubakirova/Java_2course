import java.util.function.Function;
import java.util.function.BiFunction;

/**
 * для 1-4;
 * для 6;
 * для 5 и 7;
 * для 8;
 * для 9
 */
public class LambdaRunner {
    public static Object stringLambdaRun(Function<String, ?> lambda, String str) {
        return lambda.apply(str);
    }

    public static <T extends Human> Boolean humanBiFunctionRun(BiFunction<? super Human, ? super Human, Boolean> lambda, Human human1, Human human2) {
        return lambda.apply(human1, human2);

    }

    public static <T extends Human> Object humanFunctionRun(Function<? super Human, ?> lambda, Human human) {
        return lambda.apply(human);
    }

    public static Human oldHumanRun(Function<Human, Human> lambda, Human human) {
        return lambda.apply(human);
    }

    public static boolean checkAgeRun(CheckAge lambda, Human human1, Human human2, Human human3, int maxAge) {
        return lambda.check(human1, human2, human3, maxAge);
    }

}
