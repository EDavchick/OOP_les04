import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student(4, "bbb", "bca", "aaa");
        Student student02 = new Student(2, "Aaa", "Bbb", "Ccc");
        Student student03 = new Student(3, "CCC", "cab", "abc");
        Student student04 = new Student(1, "ccc", "abc", "cba");
        Student student05 = new Student(6, "sdf", "bca", "aaa");
        List<Student> studentList = new ArrayList<>();
        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student01);
        studentGroup.addStudent(student02);
        studentGroup.addStudent(student03);
        studentGroup.addStudent(student04);
        studentGroup.addStudent(student05);

        StudentGroupService service = new StudentGroupService(studentGroup);
//        for(Student student : service.getSortedStudentGroup()) System.out.println(student);

        // сейчас в интерфейс UserView<Student> мы передаем реализацию метода из StudentView
        UserView<Student> view = new StudentView();
        view.sendOnConsole(studentList);  // вывод в консоль
        System.out.println();
        view.sendOnConsole(service.getSortedStudentGroupByFIO()); // сортировка по ФИО
    }
}