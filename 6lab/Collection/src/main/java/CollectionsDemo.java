import java.util.*;

public class CollectionsDemo {
    public int countOfString(ArrayList<String> strings, char symbol) {
        int result = 0;
        for (String string : strings) {
            if ((string != null && !string.isEmpty()) && string.charAt(0) == symbol)
                result++;
        }
        return result;
    }

    public ArrayList<Human> copyOfHuman(ArrayList<Human> humans, Human human) {
        ArrayList<Human> result = new ArrayList<>();
        for (Human value : humans)
            if (!value.equals(human))
                result.add(value);
        return result;
    }

    public ArrayList<HashSet<Integer>> dontIntersectSets(ArrayList<HashSet<Integer>> sets, HashSet<Integer> set) {
        ArrayList<HashSet<Integer>> result = new ArrayList<>();
        for (HashSet<Integer> value : sets)
            if (!value.equals(set))
                result.add(value);
        return result;
    }

    public LinkedList<Human> sortedHumansList(Set<Human> set) {
        Set<Human> result = new TreeSet<>(set);
        return new LinkedList<>(result);
    }

    /**
     * Интерфейс Map.Entry в Java позволяет работать с записями Map.
     * entrySet(),объявленный интерфейсом Map,возвращает Set,содержащий записи Map. Каждый из этих элементов является объектом Map.Entry.
     * keySet() возвращает множество ключей
     */
    public Set<Human> identifierHuman(Map<Integer, Human> humans, Set<Integer> id) {
        Set<Human> result = new HashSet<>();
        Set<Integer> keys = new HashSet<>(humans.keySet());
        for (Integer key : keys)
            if (id.contains(key))
                result.add(humans.get(key));
        return result;
    }

    public List<Integer> identifierAdult(Map<Integer, Human> humans) {
        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> keys = humans.keySet();
        for (Integer key : keys)
            if (humans.get(key).getAge() > 18)
                result.add(key);
        return result;
    }

    public Map<Integer, Integer> idComparisonAge(Map<Integer, Human> humans) {
        Map<Integer, Integer> result = new HashMap<>();
        Set<Integer> keys = humans.keySet();
        for (Integer key : keys)
            result.put(key, humans.get(key).getAge());
        return result;
    }

    public Map<Integer, List<Human>> comparisonList(Set<Human> humans) {
        Map<Integer, List<Human>> result = new HashMap<>();
        for (Human human : humans) {
            if (result.containsKey(human.getAge()))
                result.get(human.getAge()).add(human);
            else {
                List<Human> list = new ArrayList<>();
                list.add(human);
                result.put(human.getAge(), list);
            }
        }
        return result;
    }


//    public Map<Integer, List<Human>> comparisonList(Set<Human> humans) {
//        Map<Integer, List<Human>> res = new TreeMap<>();
//        for (Human temp : humans) {
//            List<Human> tempList = new ArrayList<>();
//            tempList.add(temp);
//            res.put(temp.getAge(), tempList);
//        }
//        return res;
//    }
}
