import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HouseSerializeAndDeserializeTest {

    @Test
    void houseSerializeAndDeserialize() throws Exception {
        List<Flat> flats = new LinkedList<>();
        List<Person> personFlat2 = new LinkedList<>();
        List<Person> personFlat3 = new LinkedList<>();
        personFlat2.add(new Person("Олег", "Власов", "Юрьевич", 13, 2, 2002));
        personFlat2.add(new Person("Сергей", "Власов", "Денисович", 17, 8, 1980));

        personFlat3.add(new Person("Евгений", "Жданов", "Павловна", 25, 3, 1990));
        personFlat3.add(new Person("София", "Жданова", "Петровна", 19, 1, 2003));
        personFlat3.add(new Person("Елизавета", "Жданова", "Павловна", 7, 9, 1981));

        flats.add(new Flat(1, 110, Collections.singletonList(new Person(
                "Иван", "Орлов", "Алексеевич", 1, 5, 1999))));
        flats.add(new Flat(2, 55, Collections.singletonList(new Person(
                "Александр", "Давыдов", "Сергеевич", 4, 1, 1977))));

        flats.add(new Flat(5, 23, personFlat2));
        flats.add(new Flat(11, 80, personFlat3));


        House house = new House("31", "ул. Мира 32", new Person
                ("Сергей", "Власов", "Денисович", 17, 8, 1980), flats);

        HouseSerializeAndDeserialize.houseSerialize(house,  new File("data.txt"));
        assertEquals(house, HouseSerializeAndDeserialize.houseDeserialize(new File("data.txt")));
    }
}