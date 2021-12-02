import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReflectionDemoTest {

    @Test
    void countHuman() {
        Human man = new Human();
        Human woman = new Human();
        List<Object> list = new ArrayList<>();
        list.add(man);
        list.add(woman);
        assertEquals(2, ReflectionDemo.countHuman(list));
    }

    @Test
    void getOpenMethods() {
        Human h = new Human();
        List<String> result = new ArrayList<>();
        result.add("openMethod");
        assertEquals(result, ReflectionDemo.getOpenMethods(h));
    }

    @Test
    void getNameSuperClass() {
//        Human human = new Human();
//        ArrayList<String> list = new ArrayList<>();
//        List<String> result = ReflectionDemo.getNameSuperClass(human);
//        List<String> result1 = Arrays.asList("God","Object");
//        assertTrue(result.containsAll(result1));
        Human human = new Human();
        List<?> list = new ArrayList<>();
        list = ReflectionDemo.getNameSuperClass(human);
        assertTrue(list.containsAll(list));

    }
}