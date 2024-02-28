import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    List<Teacher> teachersList = new ArrayList<>();

    public TeacherGroup(List<Teacher> teacherList) {
        this.teachersList = teacherList;
    }
    public void addTeacher(Teacher teacher){ teachersList.add(teacher);}

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teacherList="  + '\n'  + teachersList +
                '}';
    }
}
