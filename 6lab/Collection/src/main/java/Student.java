public class Student extends Human {
    private String nameFaculty;

    public Student(String surname, String name, String patronymic, int age, String nameFaculty) {
        super(surname, name, patronymic, age);
        this.nameFaculty = nameFaculty;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }
}
