import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator  implements Iterator<Student> {
    List<Student> studentList;
    int counter = 0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.studentsList;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if(!hasNext())
            return null;
        return studentList.get(counter++);
    }

    @Override
    public void remove() {
        if(hasNext())
            studentList.remove(--counter);
    }
}
