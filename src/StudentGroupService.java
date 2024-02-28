import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    public List<Student> getSortedStudentGroup(){
        // создаем копию списка без ссылки на него для того, чтобы при сортировке наш основной список никак не поменялся
        List<Student> studentList = new ArrayList<>(studentGroup.studentsList);
        Collections.sort(studentList);
        return studentList;
    }
    public List<Student> getSortedStudentGroupByFIO(){
        // создаем копию списка без ссылки на него для того, чтобы при сортировке наш основной список никак не поменялся
        List<Student> studentList = new ArrayList<>(studentGroup.studentsList);
//        Collections.sort(studentList, new StudentComparator());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }
}
