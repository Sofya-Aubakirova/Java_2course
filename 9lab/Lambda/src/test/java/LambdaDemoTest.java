import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LambdaDemoTest {

    String s1 = "1";
    String s2 = "привет";
    String s3 = null;
    String s4 = "";
    String s5 = "one two";
    String s6 = "da,da,da";
    String s7 = "один,два,три,четыре";

    @Test
    void strLengthTest() {
        assertEquals(1, LambdaDemo.strLength.apply(s1));
        assertEquals(6, LambdaDemo.strLength.apply(s2));
        assertNull(LambdaDemo.strLength.apply(s3));
        assertEquals(0, LambdaDemo.strLength.apply(s4));

    }

    @Test
    void firstSumbolTest() {
        assertEquals('1', LambdaDemo.firstSumbol.apply(s1));
        assertEquals('п', LambdaDemo.firstSumbol.apply(s2));
        assertNull(LambdaDemo.firstSumbol.apply(s3));
        assertNull(LambdaDemo.firstSumbol.apply(s4));
    }

    @Test
    void haventSpaceTest() {
        assertTrue(LambdaDemo.haventSpace.apply(s1));
        assertTrue(LambdaDemo.haventSpace.apply(s2));
        assertNull(LambdaDemo.haventSpace.apply(s3));
        assertNull(LambdaDemo.haventSpace.apply(s4));
        assertFalse(LambdaDemo.haventSpace.apply(s5));
    }

    @Test
    void getCountTest() {
        assertEquals(1, LambdaDemo.getCount.apply(s1));
        assertEquals(1, LambdaDemo.getCount.apply(s2));
        assertNull(LambdaDemo.haventSpace.apply(s3));
        assertNull(LambdaDemo.haventSpace.apply(s4));
        assertEquals(3, LambdaDemo.getCount.apply(s6));
        assertEquals(4, LambdaDemo.getCount.apply(s7));
    }

    @Test
    public void ageHumanTest() throws Exception {
        Human h1 = new Human("Иванов", "Иван", "Иванович", 45, Human.Gender.MALE);
        Student h2 = new Student("Петров", "Петр", "Петрович", 32, Human.Gender.MALE,
                "Омгу", "имит", "мпб");

        assertEquals(45, LambdaDemo.ageHuman.apply(h1));
        assertEquals(32, LambdaDemo.ageHuman.apply(h2));
    }

    @Test
    void haveOneLastNameTest() throws Exception {
        Human h1 = new Human("Иванов", "Иван", "Иванович", 45, Human.Gender.MALE);
        Student h2 = new Student("Иванов", "Петр", "Петрович", 32, Human.Gender.MALE,
                "омгу", "имит", "мпб");
        Human h3 = new Human("Петров", "Петр", "Петрович", 19, Human.Gender.MALE);

        assertTrue(LambdaDemo.haveOneLastName.apply(h1, h2));
        assertFalse(LambdaDemo.haveOneLastName.apply(h2, h3));
    }

    @Test
    void fioHumanTest() throws Exception {
        Human h1 = new Human("Иванов", "Иван", "Иванович", 45, Human.Gender.MALE);
        Student h2 = new Student("Петров", "Петр", "Петрович", 32, Human.Gender.MALE,
                "омгу", "имит", "мпб");
        Human h3 = new Human("Смирнов", "Николай", "Николаевич", 19, Human.Gender.MALE);

        assertEquals("Иванов Иван Иванович", LambdaDemo.fioHuman.apply(h1));
        assertEquals("Петров Петр Петрович", LambdaDemo.fioHuman.apply(h2));
        assertEquals("Смирнов Николай Николаевич", LambdaDemo.fioHuman.apply(h3));
    }

    @Test
    void oldHuman() throws Exception {
        Human h1 = new Human("Иванов", "Иван", "Иванович", 45, Human.Gender.MALE);
        Human h2 = new Human("Петров", "Петр", "Петрович", 32, Human.Gender.MALE);

        assertEquals(46, LambdaDemo.oldHuman.apply(h1).getAge());
        assertEquals(33, LambdaDemo.oldHuman.apply(h2).getAge());
    }

    @Test
    void checkAgeTest() throws Exception {
        Human h1 = new Human("Иванов", "Иван", "Иванович", 17, Human.Gender.MALE);
        Human h2 = new Human("Иванова", "Анастасия", "Ивановна", 29, Human.Gender.FEMALE);
        Human h3 = new Human("Петров", "Петр", "Петрович", 25, Human.Gender.MALE);
        Human h4 = new Human("Петрова", "Анастасия", "Петровна", 26, Human.Gender.FEMALE);

        int maxAge = 30;
        int maxAge1 = 28;

        assertTrue(LambdaDemo.checkAge.check(h1, h2, h3, maxAge));
        assertFalse(LambdaDemo.checkAge.check(h2, h3, h4, maxAge1));
    }


}
