import java.util.Objects;

/**
 * Напишите производный класс Student  с добавленными
 * полями университет, факультет, специальность.
 */
public class Student extends Human {

    private String university;
    private String faculty;
    private String specialisation;

    public Student(String lastName, String name, String patronumic,
                   int age, Gender gender,
                   String university,
                   String faculty,
                   String specialisation) throws Exception {
        super(lastName, name, patronumic, age, gender);
        if (university == null || university.isEmpty()
                || faculty == null || faculty.isEmpty()
                || specialisation == null || specialisation.isEmpty())
            throw new Exception();
        this.university = university;
        this.faculty = faculty;
        this.specialisation = specialisation;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) throws Exception {
        if (university == null || university.isEmpty())
            throw new Exception();
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) throws Exception {
        if (faculty == null || faculty.isEmpty())
            throw new Exception();
        this.faculty = faculty;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) throws Exception {
        if (specialisation == null || specialisation.isEmpty())
            throw new Exception();
        this.specialisation = specialisation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return university.equals(student.university) && faculty.equals(student.faculty) && specialisation.equals(student.specialisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), university, faculty, specialisation);
    }
}
