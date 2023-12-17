package principlesOOP4.model;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User implements Comparable<Teacher> {

    private int teacherId;

    public Teacher(int teacherId,String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
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
                "teacherId = " + teacherId +
                ", firstName = '" + super.getFirstName() + '\'' +
                ", secondName = '" + super.getSecondName() + '\'' +
                ", patronymic = '" + super.getPatronymic() + '\'' +
                ", dateOfBirth = " + super.getDateOfBirth() +
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