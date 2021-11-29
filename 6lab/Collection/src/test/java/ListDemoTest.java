import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class ListDemoTest {

    @Test
    void surnameHumanTest() {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Манн", "Томас", "Олегович", 146));
        humans.add(new Human("Камю", "Альбер", "Викторович", 108));
        humans.add(new Human("Гессе", "Герман", "Игоревич", 144));
        humans.add(new Human("Кафка", "Франц", "Михайлович", 138));

        ArrayList<Human> result = new ArrayList<>();
        result.add(new Human("Манн", "Томас", "Олегович", 146));

        Assertions.assertEquals(result, new ListDemo().surnameHuman(humans, new Human("Манн", "Николас", "Фламель", 146)));
    }
    @Test
    void maximumAgeHumanTest() {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Student("Манн", "Томас", "Олегович", 146, "Kirov"));
        humans.add(new Human("Камю", "Альбер", "Викторович", 108 ));
        humans.add(new Human("Гессе", "Герман", "Игоревич", 144));
        humans.add(new Human("Кафка", "Франц", "Михайлович", 138));
        humans.add(new Student("Томас", "Манн", "Максимович", 146,"Kirov" ));

        ArrayList<Human> result = new ArrayList<>();
        result.add(new Student("Манн", "Томас", "Олегович", 146,"Kirov" ));
        result.add(new Student("Томас", "Манн", "Максимович", 146,"Kirov" ));

        Assertions.assertEquals(result, new ListDemo().maximumAgeHuman(humans));
    }
}