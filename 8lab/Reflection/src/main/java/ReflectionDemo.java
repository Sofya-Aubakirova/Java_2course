import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ReflectionDemo {
    public static int countHuman(List<?> objects) {
        int count = 0;
        for (Object o : objects) {
            if (o instanceof Human)
                count++;
        }
        return count;
    }

    public static List<String> getOpenMethods(Object object) {
        List<String> list = new ArrayList<>();
        for (Method method : object.getClass().getMethods()) {
            if (method.getDeclaringClass().equals(object.getClass())) {
                list.add(method.getName());
            }
        }
        return list;
        //return Arrays.stream(object.getClass().getDeclaredMethods()).filter(method -> Modifier.isPublic(method.getModifiers())).collect(Collectors.toList());
    }

    public static List<String> getNameSuperClass(Object object) {
        List<String> result = new ArrayList<>();
        for (Class superClass = object.getClass().getSuperclass();
             superClass != null;
             superClass = superClass.getSuperclass())
            result.add(superClass.getName());

        return result;
    }

}

