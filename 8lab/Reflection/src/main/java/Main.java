import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        List<?> list = new ArrayList<>();
        list = ReflectionDemo.getNameSuperClass(human);
        System.out.println(list);
    }
}
