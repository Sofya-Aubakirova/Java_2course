import java.util.ArrayList;

public class ListDemo {
    public ArrayList<Human> surnameHuman(ArrayList<Human> humans, Human human) {
        ArrayList<Human> result = new ArrayList<>();
        for (Human value : humans) {
            if (human.getSurname().equals(value.getSurname()))
                result.add(value);
        }
        return result;
    }

    public ArrayList<Human> maximumAgeHuman(ArrayList<Human> humans) {
        ArrayList<Human> result = new ArrayList<>();
        int maxAge = 0;
        for (Human human : humans)
            if (human.getAge() > maxAge)
                maxAge = human.getAge();
        for (Human temp : humans)
            if (temp.getAge() == maxAge)
                result.add(temp);
        return result;
    }

}
