public class Teacher extends User{
    private Integer teacherId;

    public Teacher(String firstName, String secondName, String lastName, Integer teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName = '" + super.getFirstName() + '\'' +
                ", secondName = '" + super.getSecondName() + '\'' +
                ", lastName = '" + super.getLastName() + '\''  +
                '}';
    }
}
