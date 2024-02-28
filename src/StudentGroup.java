import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    List<Student> studentsList = new ArrayList<>();

    public StudentGroup(List<Student> studentsList) {
        this.studentsList = studentsList;
    }
    public void addStudent(Student student){
        studentsList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return  '\n' + "StudentGroup: {" +
                "studentsList = "  + '\n' + studentsList + '}';
    }
}
