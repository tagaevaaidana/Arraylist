import java.util.ArrayList;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    /**
     * Жогоруда жазылган статичный полялар биз консолго чыгарып жаткан кодубузга
     * цвет кошуп берет, астыдагы кодту коментарийден чыгарып иштетип кор
     * Ps: бул цветтер жон гана сиздерге кызык болуусу учун эле корсотулду тапшырмага тиешеси жок,
     * бирок ушул цветтерди колдонуп консолго чыгарсанар болот.
     */
    public static void main(String[] args) {

        System.out.println(ANSI_BLUE+"Кандайсын Студент 🙂"+ANSI_RESET);
//        System.out.println(ANSI_PURPLE+"Сен бул жердеги задачаны чыгара аласын мен ишенем 😎"+ANSI_RESET);
//        System.out.println(ANSI_CYAN+"Good luck! 💪");
//        System.out.println("Have a nice weekend 😀"+ANSI_RESET);

        Student  student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();
        Student student9 = new Student();
        Student student10 = new Student();
        student.setId(1);
        student.setId(2);
        student.setId(3);
        student.setId(4);
        student.setId(5);
        student.setId(6);
        student.setId(7);
        student.setId(8);
        student.setId(9);
        student.setId(10);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);


        StudentServiceImpl studentService = new StudentServiceImpl();
        try {
            System.out.println(studentService.getById(students,1));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        try {
            System.out.println(studentService.getByName(students,"Aidana"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(studentService.getAllOfflineStudents(students));





    }
}