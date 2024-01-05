import java.util.ArrayList;

public class StudentServiceImpl implements StudentService{
    @Override
    public Student getById(ArrayList<Student> students, int studentId) {
        for (Student student : students){
            if (student.getId() == studentId){
                return student;
            }
        }
        throw new RuntimeException("Позльзователь не найден по id : " + studentId);
    }

    @Override
    public Student getByName(ArrayList<Student> students, String studentName) {
        for (Student student : students){
            if (student.getName() == studentName){
                return student;
            }
        }
        throw new RuntimeException("Позльзователь не найден по name; " + studentName);
    }

    @Override
    public void getAllStudents(ArrayList<Student> students) {
        for (Student student : students){
            System.out.println(student);
        }

    }

    @Override
    public ArrayList<Student> getAllStudentBoys(ArrayList<Student> students) {

        for (Student student : students)
            if (student.getGender().equals(Gender.MALE)) {
                return students;
            }
        throw new RuntimeException("Не найден пользователь по gender FEMALE" + Gender.MALE);
    }

    @Override
    public ArrayList<Student> getAllStudentGirls(ArrayList<Student> students) {
        for (Student student : students){
            if (student.getGender().equals(Gender.FEMALE)){
                return students;
            }
        }
        throw new RuntimeException("Не найден пользователь по gender FEMALE" + Gender.FEMALE);
    }

    @Override
    public ArrayList<Student> getAllOfflineStudents(ArrayList<Student> students) {
        for (Student student : students){
            if (student.getStudyFormat().equals(StudyFormat.OFFLINE)){
                return students;
            }
        }
        throw new RuntimeException("Не найден пользователь по формарту OFFLINE: " + StudyFormat.OFFLINE);
    }

    @Override
    public ArrayList<Student> getAllOnlineStudents(ArrayList<Student> students) {
        for (Student student : students){
            if (student.getStudyFormat().equals(StudyFormat.ONLINE)){
                return students;
            }
        }
        throw new RuntimeException("Не найден пользователь по формарту ONLINE: " + StudyFormat.ONLINE);
    }

    @Override
    public double getAverageAge(ArrayList<Student> students) {
        double summa = 0;
        for (Student student : students){
            summa+= student.getAge();
        }
        return summa/ students.size();
    }

    @Override
    public int getCountOnlineStudents(ArrayList<Student> students) {
        int countOnlineStudents = 0;
        for (Student student : students){
            if (student.getStudyFormat() == StudyFormat.ONLINE){
                countOnlineStudents++;
            }
        }
        return countOnlineStudents;
    }

    @Override
    public int getCountOfflineStudents(ArrayList<Student> students) {
        int countOfflineStudents = 0;
        for (Student student : students){
            if(student.getStudyFormat() == StudyFormat.OFFLINE){
                countOfflineStudents++;
            }
        }
        return countOfflineStudents;
    }
    /**
     *   Достор бул жердеги методторду атын айтып жаткандай реализация кылуу керек
     *   Мисалы  ArrayList<Student> getAllOfflineStudents(ArrayList<Student> students);
     *   Бул жерде Баардык Оффлайн окууган студенттерди чыгаруу керек(enum) полясы аркылуу салыштырабыз
     *
     */

// Бул жерге StudentService тин методторун алып келуу керек бирок кантип 🤔?
}
