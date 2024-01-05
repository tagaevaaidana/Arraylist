public class Student {
    private int id;
    private String name;
    private String surname;
    private int age;
    private Gender gender;

    private StudyFormat studyFormat;

    public Student() {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.studyFormat = studyFormat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public StudyFormat getStudyFormat() {
        return studyFormat;
    }

    public void setStudyFormat(StudyFormat studyFormat) {
        this.studyFormat = studyFormat;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", studyFormat=" + studyFormat +
                '}';
    }
}
