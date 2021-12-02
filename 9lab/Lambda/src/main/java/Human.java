import java.util.Objects;

/**
 * Напишите класс Human с полями фамилия, имя, отчество,
 * возраст и пол (перечисление).
 * В классе должны быть конструкторы,
 * геттеры и сеттеры, методы equals и hashCode.
 */
public class Human {

    public enum Gender {MALE, FEMALE}

    private Gender gender;
    private String name, patronumic, lastName;
    private int age;

    public Human(String lastName, String name, String patronumic, int age, Gender gender) throws Exception {
        if (name == null || name.isEmpty() || patronumic == null || patronumic.isEmpty() || lastName == null || lastName.isEmpty()
                || age <= 0)
            throw new Exception();
        this.gender = gender;
        this.age = age;
        this.name = name;
        this.patronumic = patronumic;
        this.lastName = lastName;
    }

    public Human(Human other) throws Exception {
        this(other.getLastName(), other.getName(), other.getPatronumic(), other.getAge(), other.getGender());
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name == null || name.isEmpty())
            throw new Exception();
        this.name = name;
    }

    public String getPatronumic() {
        return patronumic;
    }

    public void setPatronumic(String patronumic) throws Exception {
        if (patronumic == null || patronumic.isEmpty())
            throw new Exception();
        this.patronumic = patronumic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws Exception {
        if (lastName == null || lastName.isEmpty())
            throw new Exception();
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age <= 0)
            throw new Exception();
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && gender == human.gender && name.equals(human.name) && patronumic.equals(human.patronumic) && lastName.equals(human.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name, patronumic, lastName, age);
    }

}

