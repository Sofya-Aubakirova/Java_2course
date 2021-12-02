import java.util.Optional;
import java.util.function.Function;
import java.util.function.BiFunction;

/**
 * 1) для строки символов получить ее длину,
 * 2) для строки символов получить ее первый символ, если он существует, или null иначе,
 * 3) для строки проверить, что она не содержит пробелов,
 * 4) слова в строке разделены запятыми, по строке получить количество слов в ней,
 * 5) по человеку получить его возраст,
 * 6) по двум людям проверить, что у них одинаковая фамилия,
 * 7) получить фамилию, имя и отчество человека в виде одной строки (разделитель — пробел),
 * 8) сделать человека старше на один год (по объекту Human создать новый объект),
 * 9) по трем людям и заданному возрасту maxAge проверить, что все три человека моложе
 * maxAge.
 */
public class LambdaDemo {
    public static final Function<String, Integer> strLength = str -> Optional.ofNullable(str).map(String::length).orElse(null);

    public static final Function<String, Character> firstSumbol = str -> Optional.ofNullable(str).filter(x -> !x.isEmpty()).map(y -> y.charAt(0)).orElse(null);

    public static final Function<String, Boolean> haventSpace = str -> {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return !str.contains(" ");
    };

    public static final Function<String, Integer> getCount = str -> {
        if (str == null || str.isEmpty()) {
            return null;
        }

        return str.split(",").length;
    };

    public static final Function<? super Human, Integer> ageHuman = Human::getAge;

    public static final BiFunction<? super Human, ? super Human, Boolean> haveOneLastName = (human1, human2) -> human1.getLastName().equals(human2.getLastName());

    public static final Function<? super Human, String> fioHuman = str -> str.getLastName() + " " + str.getName() + " " + str.getPatronumic();

    public static final Function<Human, Human> oldHuman = human -> {
        try {
            return new Human(human.getLastName(), human.getName(), human.getPatronumic(), human.getAge() + 1,
                    human.getGender());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    };

    public static final CheckAge checkAge = (human1, human2, human3, maxAge) ->
            human1.getAge() < maxAge && human2.getAge() < maxAge && human3.getAge() < maxAge;

}

