import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class CollectionsDemoTest {

    @Test
    void countOfStringTest() {
        CollectionsDemo demo = new CollectionsDemo();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Кафка");
        Assertions.assertEquals(1, demo.countOfString(strings, 'К'));
    }

    @Test
    void copyOfHumanTest() {
        CollectionsDemo demo = new CollectionsDemo();

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Манн", "Томас", "Олегович", 146));
        humans.add(new Human("Камю", "Альбер", "Викторович", 108));
        humans.add(new Human("Гессе", "Герман", "Игоревич", 144));
        humans.add(new Human("Кафка", "Франц", "Михайлович", 138));

        ArrayList<Human> result = new ArrayList<>();
        result.add(new Human("Камю", "Альбер", "Викторович", 108));
        result.add(new Human("Гессе", "Герман", "Игоревич", 144));
        result.add(new Human("Кафка", "Франц", "Михайлович", 138));

        Assertions.assertEquals(result, demo.copyOfHuman(humans, new Human("Манн", "Томас", "Олегович", 146)));
    }

    @Test
    void dontIntersectSetsTest() {
        CollectionsDemo demo = new CollectionsDemo();

        ArrayList<HashSet<Integer>> list = new ArrayList<>();
        list.add(new HashSet<>());
        list.add(new LinkedHashSet<>());
        list.add(new HashSet<>());

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        ArrayList<HashSet<Integer>> result = new ArrayList<>();
        result.add(new HashSet<>());
        result.add(new HashSet<>());
        result.add(new HashSet<>());

        Assertions.assertEquals(result, demo.dontIntersectSets(list, hashSet));
    }

    @Test
    void identifierHumanTest() {
        CollectionsDemo demo = new CollectionsDemo();

        HashMap<Integer, Human> humans = new HashMap<>();
        humans.put(1, new Human("Манн", "Томас", "Олегович", 146));
        humans.put(2, new Human("Камю", "Альбер", "Викторович", 108));
        humans.put(3, new Human("Гессе", "Герман", "Игоревич", 144));
        humans.put(4, new Human("Кафка", "Франц", "Михайлович", 138));

        HashSet<Integer> id = new HashSet<>();
        id.add(1);
        id.add(2);
        id.add(3);

        HashSet<Human> result = new HashSet<>();
        result.add(new Human("Манн", "Томас", "Олегович", 146));
        result.add(new Human("Камю", "Альбер", "Викторович", 108));
        result.add(new Human("Гессе", "Герман", "Игоревич", 144));
        Assertions.assertEquals(result, demo.identifierHuman(humans, id));
    }

    @Test
    void identifierAdultTest() {
        CollectionsDemo demo = new CollectionsDemo();

        HashMap<Integer, Human> humans = new HashMap<>();
        humans.put(1, new Human("Манн", "Томас", "Олегович", 14));
        humans.put(2, new Human("Камю", "Альбер", "Викторович", 18));
        humans.put(3, new Human("Гессе", "Герман", "Игоревич", 19));
        humans.put(4, new Human("Кафка", "Франц", "Михайлович", 32));


        ArrayList<Integer> result = new ArrayList<>();
        result.add(3);
        result.add(4);
        Assertions.assertEquals(result, demo.identifierAdult(humans));
    }

    @Test
    void idComparisonAgeTest() {
        CollectionsDemo demo = new CollectionsDemo();

        Map<Integer, Human> tabl = new HashMap<>();
        tabl.put(1, new Human("Манн", "Томас", "Олегович", 14));
        tabl.put(2, new Human("Камю", "Альбер", "Викторович", 18));
        tabl.put(3, new Human("Гессе", "Герман", "Игоревич", 19));
        tabl.put(4, new Human("Кафка", "Франц", "Михайлович", 32));

        Map<Integer, Integer> result = new HashMap<>();
        result.put(1, 14);
        result.put(2, 18);
        result.put(3, 19);
        result.put(4, 32);

        Assertions.assertEquals(result, demo.idComparisonAge(tabl));
    }

    @Test
    void comparisonListTest() {
        CollectionsDemo demo = new CollectionsDemo();

        Map<Integer, List<Human>> hashMap = new HashMap<>();
        List<Human> list1 = new ArrayList<>();
        List<Human> list2 = new ArrayList<>();
        List<Human> list3 = new ArrayList<>();
        List<Human> list4 = new ArrayList<>();

        list1.add(new Human("Манн", "Томас", "Олегович", 14));
        list1.add(new Human("А", "Томас", "Олегович", 14));
        list2.add(new Human("Камю", "Альбер", "Викторович", 18));
        list3.add(new Human("Гессе", "Герман", "Игоревич", 19));
        list4.add(new Human("Кафка", "Франц", "Михайлович", 32));

        hashMap.put(14, list1);
        hashMap.put(18, list2);
        hashMap.put(19, list3);
        hashMap.put(32, list4);

        HashSet<Human> humans = new LinkedHashSet<>();
        humans.add(new Human("Манн", "Томас", "Олегович", 14));
        humans.add(new Human("А", "Томас", "Олегович", 14));
        humans.add(new Human("Камю", "Альбер", "Викторович", 18));
        humans.add(new Human("Гессе", "Герман", "Игоревич", 19));
        humans.add(new Human("Кафка", "Франц", "Михайлович", 32));

        Assertions.assertEquals(hashMap, demo.comparisonList(humans));
    }
}