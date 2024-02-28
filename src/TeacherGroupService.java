import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherGroupService {
    TeacherGroup teacherGroup;

    public TeacherGroupService(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }
    public List<Teacher> getSortedTeacherGroup(){
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.teachersList);
        teacherList.sort(new UserComparator<Teacher>());
        return teacherList;
    }
}
