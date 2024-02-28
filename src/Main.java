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

        StudentGroupService studentGroupService = new StudentGroupService(studentGroup);
//        for(Student student : service.getSortedStudentGroup()) System.out.println(student);

        // сейчас в интерфейс UserView<Student> мы передаем реализацию метода из StudentView
        UserView<Student> studentUserView = new StudentView();
        studentUserView.sendOnConsole(studentList);  // вывод в консоль
        System.out.println();
        studentUserView.sendOnConsole(studentGroupService.getSortedStudentGroupByFIO()); // сортировка по ФИО
        System.out.println();

        Teacher teacher01 = new Teacher("bbb", "bca", "aaa", 1);
        Teacher teacher02 = new Teacher("aaa", "bca", "aaa", 5);
        Teacher teacher03 = new Teacher("ddd", "bca", "aaa", 3);
        Teacher teacher04 = new Teacher("fff", "bca", "aaa", 7);
        Teacher teacher05 = new Teacher("ccc", "bca", "aaa", 2);
        List<Teacher> teacherList = new ArrayList<>();
        TeacherGroup teacherGroup = new TeacherGroup(teacherList);
        teacherGroup.addTeacher(teacher01);
        teacherGroup.addTeacher(teacher02);
        teacherGroup.addTeacher(teacher03);
        teacherGroup.addTeacher(teacher04);
        teacherGroup.addTeacher(teacher05);

        TeacherGroupService teacherGroupService = new TeacherGroupService(teacherGroup);
        UserView<Teacher> teacherUserView = new TeacherView();
        teacherUserView.sendOnConsole(teacherList); // вывод в консоль
        System.out.println();
        teacherUserView.sendOnConsole(teacherGroupService.getSortedTeacherGroup()); // сортировка по ФИО
    }
}