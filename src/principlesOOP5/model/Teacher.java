package principlesOOP5.model;



public class Teacher extends User implements Comparable<Teacher> {
    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super ( firstName, secondName, lastName );
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + super.getFirstName () + '\'' +
                ", secondName='" + super.getSecondName () + '\'' +
                ", lastName='" + super.getLastName () + '\'' +
                '}';
    }
    @Override
    public int compareTo(Teacher o) {
        if (o.getTeacherId () > teacherId)
            return -1;
        if (o.getTeacherId () < teacherId)
            return 1;
        return 0;
    }
}
