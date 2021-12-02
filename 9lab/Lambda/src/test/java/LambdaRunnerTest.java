import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class LambdaRunnerTest {
    @Test
    void stringLambdaRunTest() {
        Function<String, Integer> lambda = LambdaDemo.strLength;
        String s1 = "hello";

        assertEquals(5, LambdaRunner.stringLambdaRun(lambda, s1));

    }
    @Test
    void humanBiFunctionRunTest() throws Exception {
        BiFunction<? super Human, ? super Human, Boolean> lambda = LambdaDemo.haveOneLastName;
        Human human1 = new Human("Ивановых", "Иван", "Иванович", 53, Human.Gender.MALE);
        Student human2 = new Student("Ивановых", "Анастасия", "Ивановна", 21, Human.Gender.FEMALE,
                "омгу", "имит", "мпб");
        assertTrue(LambdaRunner.humanBiFunctionRun(lambda, human1, human2));
    }

    @Test
    void humanFunctionRunTest() throws Exception {
        Function<? super Human, Integer> lambda = LambdaDemo.ageHuman;
        Human human = new Human("Иванов", "Иван", "Иванович", 25, Human.Gender.MALE);
        Student student = new Student("Ивановых", "Анастасия", "Ивановна", 21, Human.Gender.FEMALE,
                "омгу", "имит", "мпб");
        assertEquals(25, LambdaRunner.humanFunctionRun(lambda, human));
        assertEquals(21, LambdaRunner.humanFunctionRun(lambda, student));
    }

    @Test
    void oldHumanRunTest() throws Exception {
        Function<Human, Human> lambda = LambdaDemo.oldHuman;
        Human human = new Human("Иванов", "Иван", "Иванович", 25, Human.Gender.MALE);

        assertEquals(26, LambdaRunner.oldHumanRun(lambda, human).getAge());
    }

    @Test
    void testCheckAgeRun() throws Exception {
        CheckAge lambda = LambdaDemo.checkAge;
        Human h1 = new Human("Иванова", "Анастасия", "Ивановна", 42, Human.Gender.FEMALE);
        Human h2 = new Human("Петрова", "Ксения", "Игоревна", 17, Human.Gender.FEMALE);
        Human h3 = new Human("Смирнова", "Ульяна", "Петровна", 30, Human.Gender.FEMALE);

        assertTrue(LambdaRunner.checkAgeRun(lambda, h1, h2, h3, 45));
    }


}
